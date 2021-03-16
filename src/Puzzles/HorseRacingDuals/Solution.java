package Puzzles.HorseRacingDuals;
//https://www.codingame.com/training/easy/horse-racing-duals
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int difference = Integer.MAX_VALUE;
        ArrayList<Integer> horses = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horses.add(pi) ;
        }

        Collections.sort(horses);

        for(int i = 1; i < N; i++){
            int j = horses.get(i) - horses.get(i-1);
            if(j < difference)
                difference = j;
        }

        System.out.println(difference);
    }
}