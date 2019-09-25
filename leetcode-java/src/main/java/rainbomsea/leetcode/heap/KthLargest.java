package rainbomsea.leetcode.heap;

import java.util.PriorityQueue;

/**
 * 703. 数据流中的第K大元素
 * 
 * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组 nums 的构造器，它包含数据流中的初始元素。
 * 每次调用 KthLargest.add，返回当前数据流中第K大的元素。
 * @author RainbomSea
 *
 */
public class KthLargest {
	
	private PriorityQueue<Integer> heap;
	private int k;
	
    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<Integer>(k);
        
        for (int i : nums) {
			add(i);
		}
    }
    
    public int add(int val) {
    	if(heap.size() < k) {
    		heap.offer(val);
    	} else if(heap.peek() < val) {
    		heap.poll();
    		heap.offer(val);
    	}
		return heap.peek();
    }
}
