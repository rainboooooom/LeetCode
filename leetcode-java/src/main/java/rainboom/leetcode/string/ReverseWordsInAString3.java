package rainboom.leetcode.string;

public class ReverseWordsInAString3 {
    public String reverseWords(String s) {
		int left = 0;
		int right = 0;
    	char[] result = s.toCharArray();
		
		while(right < result.length-1) {
			for(int i = right; i < result.length; i++) {
				if(i == result.length - 1 || result[i+1] == ' ') {
					right = i;
					break;
				}
			}
			int refer = right; // 记录指针
			// 交换
			while(left < right) { 
				char temp = result[left];
				result[left++] = result[right];
				result[right--] = temp;
			}
			// "abc dec" 当前refer指针在c上, 所以需要加上2
			left = right = refer + 2;
		}
    	return String.valueOf(result);
    }
    
    public static void main(String[] args) {
		System.out.println(new ReverseWordsInAString3().reverseWords("Let's take LeetCode contest"));
	}
}
