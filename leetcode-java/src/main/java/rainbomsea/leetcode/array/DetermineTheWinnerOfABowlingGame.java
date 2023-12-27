package rainbomsea.leetcode.array;

/**
 * 2660. 保龄球游戏的获胜者
 */
public class DetermineTheWinnerOfABowlingGame {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = computeScore(player1);
        int score2 = computeScore(player2);
        return score1 == score2 ? 0 : score1 > score2 ? 1 : 2;
    }

    private int computeScore(int[] player) {
        int index = -10;
        int score = 0;
        for (int i = 0; i < player.length; i++) {
            score += i - index <= 2 ? player[i] * 2 : player[i];
            if(player[i] == 10) {
                index = i;
            }
        }
        return score;
    }
}
