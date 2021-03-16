package Puzzles.SudokuValidator;

//https://www.codingame.com/training/easy/sudoku-validator
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int n = in.nextInt();
                grid[row][col] = n;
            }
        }
        System.out.println(correctRow(grid) && correctCol(grid) && subGrid(grid));
    }

    public static boolean correctRow(int[][] grid){
        for(int row = 0; row < 9; row++){
            Set<Integer> line = new HashSet<>();
            for(int col = 0; col < 9; col++){
                if(!line.add(grid[row][col]))
                    return false;
            }
        }
        return true;
    }

    public static boolean correctCol(int[][] grid){
        for(int col = 0; col < 9; col++){
            Set<Integer> line = new HashSet<Integer>();
            for(int row = 0; row < 9; row++){
                if(!line.add(grid[row][col]))
                    return false;
            }
        }
        return true;
    }
    public static boolean subGrid(int[][] grid){
        for(int gridRow = 0; gridRow < 9; gridRow += 3){
            for(int gridCol = 0; gridCol < 9; gridCol += 3){
                Set<Integer> subGrid = new HashSet<Integer>();
                for(int subRow = gridRow; subRow < gridRow + 3; subRow++){
                    for(int subCol = gridCol; subCol < gridCol + 3; subCol++){
                        if(!subGrid.add(grid[subRow][subCol]))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}