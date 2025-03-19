package rainboom.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 1276. 不浪费原料的汉堡制作方案
 */
public class NumberOfBurgersWithNoWasteOfIngredients {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        ArrayList<Integer> res = new ArrayList<>();
        int temp = tomatoSlices - 2 * cheeseSlices;
        if (temp >= 0 && temp % 2 == 0 && temp <= 2 * cheeseSlices) {
           res.add(temp / 2);
           res.add(cheeseSlices - temp / 2);
        }
        return res;
    }
}
