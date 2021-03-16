package Puzzles.WaysToMakeChange;

//https://www.codingame.com/training/medium/ways-to-make-change
import java.util.*;
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int S = in.nextInt();
        int[] coinValues = new int[S];
        for (int i = 0; i < S; i++) {
            coinValues[i] = in.nextInt();
        }
        System.out.println(countComb(N, coinValues));
    }

    public static int countComb(int sum, int[] coinValues) {
        int[] array = new int[sum+1];
        array[0] = 1;
        for (int coin : coinValues) {
            for (int j = coin; j <= sum; j++) {
                array[j] += array[j - coin];
            }
        }
        return array[sum];
    }
}