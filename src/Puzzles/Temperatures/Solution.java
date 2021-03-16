package Puzzles.Temperatures;
//https://www.codingame.com/training/easy/temperatures
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int difference = 5526;
        int tempClose = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            temperatures[i] = t;
        }

        for(int i = 0; i < n; i++){
            if(Math.abs(temperatures[i]) < difference){
                difference = Math.abs(temperatures[i]);
                tempClose = temperatures[i];
            }
            if(Math.abs(temperatures[i]) == difference){
                if(temperatures[i] > 0){
                    tempClose = temperatures[i];
                }
            }
        }

        System.out.println(tempClose);
    }
}