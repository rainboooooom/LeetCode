package rainboom.leetcode.array;

/**
 * 832. 翻转图像
 * 
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * 
 * @author RainbomSea
 *
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
    	int len = A[0].length;
    	for (int[] row : A) {
			for (int i = 0; i < (len + 1) / 2; i++) {
				int temp = row[i] ^ 1;
				row[i] = row[len-1-i] ^ 1;
				row[len-1-i] = temp;
			}
		}
		return A;
    }
}
