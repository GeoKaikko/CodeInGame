package Puzzles.HaltingSequences;
//https://www.codingame.com/training/medium/halting-sequences
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = in.nextInt();
            pairs[i][1] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(loopHalt(pairs[i][0], pairs[i][1]));
        }

    }
    static String loopHalt(int a, int b){
        long compare = a+b;
        int x = a;
        int y = b;
        while(compare%2==0 && compare !=2){
            if(x==y){
                return "halts";
            }
            compare/=2;
            y -= x;
            x *=2;
            if(x>y){
                int z = x;
                x = y;
                y = z;
            }
        }
        return compare==2?"halts":"loops";
    }
}