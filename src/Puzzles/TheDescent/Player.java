package Puzzles.TheDescent;
// https://www.codingame.com/training/easy/the-descent
import java.util.*;
/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mountains = new int[8];
        // game loop
        while (true) {
            int highest = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                mountains[i] = mountainH;
                if(i > 0){
                    if(mountains[i] > mountains[highest]){
                        highest = i;
                    }
                }
            }
            System.out.println(highest); // The index of the mountain to fire on.
        }
    }
}