package topics.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Design a data structure that supports all following
 *         operations in average O(1) time.
 * 
 *         1. insert(val): Inserts an item val to the set if not already
 *         present. 
 *         2. remove(val): Removes an item val from the set if present.
 *         getRandom: 
 *         3. Returns a random element from current set of elements.
 *         Each element must have the same probability of being returned.
 * 
 *         Example :
 * 
 *         // Init an empty set. RandomizedSet randomSet = new RandomizedSet();
 *
 *         // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 *         randomSet.insert(1);
 * 
 *         // Returns false as 2 does not exist in the set. randomSet.remove(2);
 *         // Inserts 2 to the set, returns true. Set now contains [1,2].
 *         randomSet.insert(2);
 * 
 *         // getRandom should return either 1 or 2 randomly.
 *         randomSet.getRandom();
 * 
 *         // Removes 1 from the set, returns true. Set now contains [2].
 *         randomSet.remove(1);
 * 
 *         // 2 was already in the set, so return false. randomSet.insert(2);
 * 
 *         // Since 2 is the only number in the set, getRandom always return 2.
 *         randomSet.getRandom();
 *
 */

public class RandomSet {

	public static void main(String[] args) {
		RSet rset = new RSet();
		
		System.out.println(rset.insert(1));
		
		System.out.println(rset.remove(2));
		
		// Inserts 2 to the set, returns true. Set now contains [1,2].
		System.out.println(rset.insert(2));

		// getRandom should return either 1 or 2 randomly.
		System.out.println(rset.getRandom());

		// Removes 1 from the set, returns true. Set now contains [2].
		System.out.println(rset.remove(1));

		// 2 was already in the set, so return false.
		System.out.println(rset.insert(2));

		// Since 2 is the only number in the set, getRandom always return 2.
		System.out.println(rset.getRandom());
	}

}

class RSet {
	private ArrayList<Integer> aList;
	private HashMap<Integer, Integer> map;
	private Random rand;

	public RSet() {
		aList = new ArrayList<Integer>();
		map = new HashMap<Integer, Integer>();
		rand = new Random();
	}
	
	public boolean insert(int val) {
		if (map.containsKey(val))
			return false;
		map.put(val, aList.size());
		aList.add(val);
		return true;
	}
	
	public boolean remove(int val) {
		if (!map.containsKey(val))
			return false;
		int position = map.get(val);
		if (position < aList.size() - 1) {
			int last = aList.get(aList.size()-1);
			aList.set(position, last);
			map.put(last, position);
		}
		map.remove(val);
		aList.remove(aList.size()-1);
		return true;
	}
	
	public int getRandom() {
		return aList.get(rand.nextInt(aList.size()));
	}
}
