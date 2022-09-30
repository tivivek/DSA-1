package vivekfirstcode;

import java.util.Scanner;

public class Rectangular_printing_pattern {
    public static void main(String[] args) {
        Scanner inputTaker = new Scanner(System.in);
        int input1 = inputTaker.nextInt();
        int input2 = inputTaker.nextInt();
        for(int i=1;i<=input1;i++)
        {
            for(int j=1;j<=input2;j++){
                if(i==1 || j==1 || i==input1 || j==input2 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            } System.out.println();
        }

    }
}
