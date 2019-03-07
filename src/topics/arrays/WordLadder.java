package topics.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given two words (start and end), and a dictionary, find all
 *         shortest transformation sequence(s) from start to end, such that:
 *         
 *         1. Only one letter can be changed at a time. 
 *         2. Each intermediate word must exist in the dictionary
 * 
 *         Input : start = "hit" 
 *         		   end = "cog" 
 *         	       dict = ["hot","dot","dog","lot","log"]
 *
 *         Output : [
				    	["hit","hot","dot","dog","cog"],
				    	["hit","hot","lot","log","cog"]
				    ]
 *
 */
public class WordLadder {
	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		Set<String> set = new HashSet<>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
		set.add("log");
		set.add("cog");

		List<List<String>> pathSet = findLadder(start, end, set);
		System.out.println("Below are all path : "+pathSet);
	}

	private static List<List<String>> findLadder(String start, String end, Set<String> dict) {
		Queue<String> queue = new LinkedList<>();
		Map<String, Integer> map = new HashMap<>();
		int depth = 0;

		queue.offer(start);
		map.put(start, 1);

		// BFS: find all the paths of transformation and store the depths in a HashMap
		while (!queue.isEmpty()) {
			String previous = queue.poll();
			depth = map.get(previous);
			for (int i = 0; i < previous.length(); i++) {
				char[] currString = previous.toCharArray();
				for (char c = 'a'; c <= 'z'; c++) {
					currString[i] = c;
					String newString = new String(currString);
					if (dict.contains(newString) && !map.containsKey(newString)) {
						queue.add(newString);
						map.put(newString, depth + 1);
					}
				}
			}
		}

		// DFS: backtracking from the start to put all the paths into the List
		List<List<String>> pathSet = new ArrayList<List<String>>();
		List<String> path = new ArrayList<>();
		dfs(end,start, map, path, pathSet);
		return pathSet;

	}

	private static void dfs(String start, String end, Map<String, Integer> map, List<String> path,
			List<List<String>> pathSet) {

		if (!map.containsKey(start))
			return;

		path.add(start);
		if (start.endsWith(end)) {
			Collections.reverse(path);
			pathSet.add(new ArrayList<String>(path));
			return;
		}

		int depth = map.get(start) - 1;
		for (int i = 0; i < start.length(); i++) {
			char[] stringArr = start.toCharArray();
			for (char c = 'a'; c <= 'z'; c++) {
				stringArr[i] = c;
				String newWord = new String(stringArr);
				if (map.containsKey(newWord) && map.get(newWord) == depth) {
					dfs(newWord, end, map, new ArrayList<>(path), pathSet);
				}
			}
		}

	}
}
