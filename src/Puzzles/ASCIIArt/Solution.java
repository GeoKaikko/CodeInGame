package Puzzles.ASCIIArt;
//https://www.codingame.com/training/easy/ascii-art
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        String[][] asciiArray = new String[H][27];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        T = T.toUpperCase();
        char[] text= T.toCharArray();
        String[][] solution = new String[H][text.length];
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            int start = 0;
            for(int j=0; j<27; j++){
                asciiArray[i][j] = ROW.substring(start, start+L);
                start += L;
            }
        }

        for(int i=0; i<text.length; i++){
            int k = (int)text[i]-65;
            if(k<0 || k > 25){
                k=26;
            }
            for(int j = 0; j < H; j++){
                solution[j][i] = asciiArray[j][k];
            }
        }
        for(int i = 0; i < H; i++){
            for(int j=0; j < solution[i].length; j++){
                System.out.print(solution[i][j]);
            }
            System.out.println();
        }
    }
}