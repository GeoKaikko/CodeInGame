package Puzzles.MIMEType;
// https://www.codingame.com/training/easy/mime-type
import java.util.HashMap;
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        HashMap<String, String> fileType = new HashMap<>();
        String[] fileName = new String[Q];
        for (int i = 0; i < N; i++) {
            fileType.put(in.next().toLowerCase(), in.next());
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            fileName[i] = in.nextLine();
        }
        for (int i =0; i<Q; i++) {
            boolean found = false;
            if(fileName[i].contains(".")){
                String file = fileName[i].substring(fileName[i].lastIndexOf(".")+1).toLowerCase();
                if(fileType.containsKey(file)){
                    System.out.println(fileType.get(file));
                    found = true;
                }
            }
/*            for (String key:fileType.keySet()) {
                int fileNameLength = fileName[i].length();
                if (fileNameLength > key.length()) {
                    String fileTypeEnd = ".".concat(key.toLowerCase());
                    String comp = fileName[i].substring(fileNameLength-fileTypeEnd.length()).toLowerCase();
                    if (fileTypeEnd.equals(comp)) {
                        System.out.println(fileType.get(key));
                        found = true;
                    }
                }
            }*/
            if (!found) {
                System.out.println("UNKNOWN");
            }
        }
    }
}