package Puzzles.ThereIsNoSpoon;
//https://www.codingame.com/training/medium/there-is-no-spoon-episode-1
import java.util.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        char[][] grid = new char[height][width];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int y = 0; y < height; y++) {
            String line = in.nextLine();
            for (int x = 0; x < width; x++) {
                line.getChars(x, (x + 1), grid[y], x);
            }
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (grid[y][x] == '0') {
                    System.out.print(x + " " + y + " ");
                    if (x + 1 < width) {
                        for (int a = x + 1; a < width; a++) {
                            if (grid[y][a] == '0') {
                                System.out.print((a) + " " + y + " ");
                                break;
                            }
                            if(a+1 >= width){
                                System.out.print(" -1 " + "-1 ");
                            }
                        }
                    } else {
                        System.out.print(" -1 " + "-1 ");
                    }
                    if (y + 1 < height) {
                        for (int b = y + 1; b < height; b++) {
                            if (grid[b][x] == '0') {
                                System.out.print(x + " " + (b));
                                break;
                            }
                            if(b+1 >= height){
                                System.out.print(" -1 " + "-1 ");
                            }
                        }
                    } else {
                        System.out.print(" -1 " + "-1 ");
                    }
                    System.out.println();
                }
            }
        }
    }
}