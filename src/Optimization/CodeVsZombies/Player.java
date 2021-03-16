package Optimization.CodeVsZombies;
import java.util.Scanner;

/**
 * Save humans, destroy zombies!
 **/
class Player {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            int humanCount = in.nextInt();
            int[][] humans = new int[humanCount][3];
            for (int i = 0; i < humanCount; i++) {
                int humanId = in.nextInt();
                int humanX = in.nextInt();
                int humanY = in.nextInt();
                humans[i][0] = humanId;
                humans[i][1] = humanX;
                humans[i][2] = humanY;
            }
            int zombieCount = in.nextInt();
            int[][] zombies = new int[zombieCount][5];
            for (int i = 0; i < zombieCount; i++) {
                int zombieId = in.nextInt();
                int zombieX = in.nextInt();
                int zombieY = in.nextInt();
                int zombieXNext = in.nextInt();
                int zombieYNext = in.nextInt();
                zombies[i][0] = zombieId;
                zombies[i][1] = zombieX;
                zombies[i][2] = zombieY;
                zombies[i][3] = zombieXNext;
                zombies[i][4] = zombieYNext;

            }
            String move = moveToClosestZombie(zombies, x, y);
            System.out.println(move);
        }
    }

    public static String moveToClosestZombie(int[][] zombies, int x, int y){
        String moveX = "";
        String moveY = "";
        double minDistance = Integer.MAX_VALUE;
        for (int[] zombie : zombies) {
            double diffX = Math.abs(x - zombie[3]);
            double diffY = Math.abs(y - zombie[4]);
            double distance = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
            minDistance = Math.min(distance, minDistance);
            if(minDistance <= distance){
                moveX = Integer.toString(zombie[3]);
                moveY = Integer.toString(zombie[4]);
            }
        }
        return moveX + " " + moveY;
    }
}