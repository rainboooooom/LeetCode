package rainbomsea.leetcode.tree;

/**
 * 108. 将有序数组转换为二叉搜索树
 * 
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * @author RainbomSea
 *
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
    	return helper(0, nums.length-1, nums);
    }
    
    TreeNode helper(int left, int right, int[] nums){
    	TreeNode result = null;
    	if(left <= right) {
    		int mid = (left + right + 1) / 2;
        	result = new TreeNode(nums[mid]);
        	result.left = helper(left, mid-1, nums);
        	result.right = helper(mid+1, right, nums);
    	}
    	return result;
    }
}
