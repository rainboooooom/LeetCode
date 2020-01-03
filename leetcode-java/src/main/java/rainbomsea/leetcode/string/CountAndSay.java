package rainbomsea.leetcode.string;

/**
 *  38. 外观数列
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 *      1.     1
 *      2.     11
 *      3.     21
 *      4.     1211
 *      5.     111221
 *  1 被读作  "one 1"  ("一个一") , 即 11。
 *  11 被读作 "two 1s" ("两个一"）, 即 21。
 *  21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * 注意：整数序列中的每一项将表示为一个字符串。
 *
 * @author RainbomSea
 */
public class CountAndSay {
    public String countAndSay(int n){
        String res = "1";

        for (int i  = 1; i < n; i++){
            int count = 1;
            StringBuilder builder = new StringBuilder();
            char c = res.charAt(0);

            for (int j = 1; j < res.length(); j++){
                char p = res.charAt(j);

                if (c == p){
                    count ++;
                } else {
                    builder.append(count).append(c);
                    c = p;
                    count = 1;
                }
            }

            builder.append(count).append(c);
            res = builder.toString();
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(4));
    }
}

