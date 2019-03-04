package topics.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given two words (beginWord and endWord), and a dictionary's
 *         word list, find the length of shortest transformation sequence from
 *         beginWord to endWord, such that:
 * 
 *         1. Only one letter can be changed at a time. 2. Each transformed word
 *         must exist in the word list. Note that beginWord is not a transformed
 *         word.
 * 
 *         Input : beginWord = "hit", 
 *         		   endWord = "cog", 
 *         		   wordList = ["hot","dot","dog","lot","log","cog"]
 *
 *         Output : 5 
 *         
 *         Explnation : As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 *						return its length 5
 *
 */
public class WordLadderII {
	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		String[] s = { "hot", "dot", "dog", "lot", "log", "cog" };
		List<String> wordList = new CopyOnWriteArrayList<>(Arrays.asList(s));
		int length = getShortLengthForTrSeq(beginWord, endWord, wordList);
		System.out.println("Length to shortest transformation = " + length);
	}

	private static int getShortLengthForTrSeq(String beginWord, String endWord, List<String> wordList) {
		int level = 0;
		if (!wordList.contains(endWord))
			return 0;
		Queue<String> queue = new ArrayDeque<>();
		queue.offer(beginWord);
		while (!queue.isEmpty()) {
			level++;
			String previousWord = queue.poll();
			for (String s : wordList) {
				if (isAdjacent(s, previousWord)) {
					queue.offer(s);
					wordList.remove(s);
					if (s.equals(endWord))
						return level;
				}
			}
		}
		return 0;
	}

	private static boolean isAdjacent(String s, String beginWord) {
		int count = 0;
		for (int i = 0; i < beginWord.length(); i++) {
			if (s.charAt(i) != beginWord.charAt(i))
				count++;
			if (count > 1)
				return false;
		}

		return count == 1 ? true : false;
	}
}
