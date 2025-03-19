package rainboom.leetcode.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 451. 根据字符出现频率排序
 * 
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * @author RainbomSea
 *
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
    	Map<Character, Integer> map = new HashMap<>(); 
    	StringBuilder result = new StringBuilder();
    	for(char c: s.toCharArray()) {
    		if(!map.containsKey(c)) {
    			map.put(c, 0);
    		}
    		map.put(c, map.get(c)+1);
    	}
    	Queue<Entry<Character, Integer>> queue = new PriorityQueue<>(new Comparator<Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
    	});
    	for(Entry<Character, Integer> m: map.entrySet()) {
    		queue.add(m);
    	}
    	while(!queue.isEmpty()) {
    		Entry<Character, Integer> top = queue.poll();
    		for(int i = 0;  i < top.getValue(); i++) {
    			result.append(top.getKey());
    		}
    	}
		return result.toString();
    }
}
