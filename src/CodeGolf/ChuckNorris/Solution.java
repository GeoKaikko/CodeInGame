package CodeGolf.ChuckNorris;
import java.util.Scanner;class Solution{public static void main(String[]args){String M=new Scanner(System.in).nextLine();char[]c=M.toCharArray();StringBuilder d=new StringBuilder();for(int a:c){String s=Integer.toBinaryString(a);if(s.length()<7){s="0".concat(s);}d.append(s);}int n=0;while(n<d.length()){n=p(n,d.toString());}}static int p(int n,String b){if(b.charAt(n)=='1'){p("0 ");n=p('1',b,n);}else if(b.charAt(n)=='0'){p("00 ");n=p('0',b,n);}return n;}static int p(char c,String b,int n){int a=b.length();while(n<a&&b.charAt(n)==c){p("0");n++;}if(n<a){p(" ");}return n;}static void p(String c){System.out.print(c);}}