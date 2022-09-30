package vivekfirstcode;

import java.util.Scanner;

public class Printing_patterns_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        for(int i=1;i<=input1;i++)
        { for(int j= 1;j<=input2;j++){
            System.out.print("*");
        }
        System.out.println("");}
    }
}
