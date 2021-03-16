package Puzzles.PowerOfThoreEpisode1;
//https://www.codingame.com/training/easy/power-of-thor-episode-1
import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            String direction = "";
            if(lightY > initialTy){
                direction = direction + "S";
                initialTy++;
            }
            if(lightY < initialTy) {
                direction = direction + "N";
                initialTy--;
            }
            if(lightX < initialTx){
                direction = direction + "W";
                initialTx--;
            }
            if(lightX > initialTx){
                direction = direction + "E";
                initialTx++;
            }
            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}