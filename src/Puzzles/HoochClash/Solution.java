package Puzzles.HoochClash;
import java.util.*;
// 4/3 pi r^3
//https://www.codingame.com/training/easy/hooch-clash
class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int orbSizeMin = in.nextInt();
        int orbSizeMax = in.nextInt();
        int glowingSize1 = in.nextInt();
        int glowingSize2 = in.nextInt();

        double volGlow = complVol(glowingSize1, glowingSize2);
        int count = 0;

        ArrayList<int[]> clashes = new ArrayList<>();
        for(int i = orbSizeMin; i <= orbSizeMax; i++){
            for(int j = i; j <= orbSizeMax; j++){
                if(complVol(i, j) == volGlow){
                    clashes.add(new int[]{i, j});
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("No clash");
        }
        if(count == 1){
            System.out.println("VALID");
        }
        if(count > 1){
            double diff = 0;
            int spark1 =0;
            int spark2 =0;
            for(int[] i : clashes){
                double n = sphereVol(i[1]) - sphereVol(i[0]);
                if(n > diff & i[0] != glowingSize1){
                    diff = n;
                    spark1 = i[0];
                    spark2 = i[1];
                }
            }
            System.out.println(spark1 + " " + spark2);
        }
    }

    public static double sphereVol(int diameter){
        return (4.0/3.0) * Math.PI * (Math.pow(((double)(diameter))/2, 3));
    }

    public static double complVol(int diameter1, int diameter2){
        return sphereVol(diameter1) + sphereVol(diameter2);
    }
}