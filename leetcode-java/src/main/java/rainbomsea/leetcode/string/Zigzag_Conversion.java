package rainbomsea.leetcode.string;


/**
 * 6. Z 字形变换
 * 
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * @author RainbomSea
 *
 */
public class Zigzag_Conversion {
    public String convert(String s, int numRows) {
    	
        if(numRows == 1)
            return s;
    	
    	StringBuffer[] buffers = new StringBuffer[numRows];
    	
    	for (int i = 0; i < numRows; i++) {
			buffers[i] = new StringBuffer();
		}
    	
    	char[] charArray = s.toCharArray();
    	int index = 0;
    	int flag = 1; // 记录移动方向
    	for (int i = 0; i < charArray.length; i++) {
    		buffers[index].append(charArray[i]);
    		index += flag;
    		if(index == 0 || index == numRows -1)// 到达移动边界,就换方向
    			flag *= -1;
		}
    	StringBuffer ansBuffer = new StringBuffer();
    	for (int i = 0; i < buffers.length; i++) {	
    		ansBuffer.append(buffers[i]);
		}
    	return ansBuffer.toString();
    }
    
    public static void main(String[] args) {
		System.out.println(new Zigzag_Conversion().convert("LEETCODEISHIRING", 3));
	}
}
