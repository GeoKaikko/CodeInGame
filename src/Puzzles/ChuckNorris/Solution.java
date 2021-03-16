package Puzzles.ChuckNorris;
// https://www.codingame.com/training/easy/chuck-norris
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        char[] cMessage = MESSAGE.toCharArray();
        StringBuilder binaryCode = new StringBuilder();

        for (int a : cMessage) {
            String s = Integer.toBinaryString(a);
            if(s.length() < 7){
                s = "0".concat(s);
            }
            binaryCode.append(s);
        }
        int pos = 0;
        while(pos < binaryCode.length()){
            pos = print(pos, binaryCode.toString());
        }

    }

    static int print(int pos, String binCode){
        int n = pos;
        if( binCode.charAt(pos) == '1'){
            System.out.print("0 ");
            while(n < binCode.length() &&binCode.charAt(n) == '1'){
                System.out.print("0");
                n++;
            }
            if(n < binCode.length()){
                System.out.print(" ");
            }
            return n;
        }
        if(binCode.charAt(pos) == '0'){
            System.out.print("00 ");
            while(n < binCode.length() &&binCode.charAt(n) == '0'){
                System.out.print("0");
                n++;
            }
            if(n < binCode.length()){
                System.out.print(" ");
            }
            return n;
        }
        return 10;
    }
}