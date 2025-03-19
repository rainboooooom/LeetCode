package rainboom.leetcode.stack;

/**
 * 844. 比较含退格的字符串
 * 
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
 * 判断二者是否相等，并返回结果。 # 代表退格字符。
 * @author RainbomSea
 *
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
    	char[] s = S.toCharArray();
    	int lenS = 0;
    	char[] t = T.toCharArray();
    	int lenT = 0;
    	for(int i = 0; i < s.length; i++) {
    		if(s[i] == '#') {
    			lenS = lenS >= 1 ? lenS-1:0;
    		}else {
    			s[lenS++]=s[i]; 
    		}
    	}
    	for(int i = 0; i < t.length; i++) {
    		if(t[i] == '#') {
    			lenT = lenT >= 1 ? lenT-1:0;
    		}else {
    			t[lenT++]=t[i]; 
    		}
    	}
     	return new String(s, 0, lenS).equals(new String(t, 0, lenT));
    }
}
