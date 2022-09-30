package vivekfirstcode;

import java.util.Scanner;

public class Right_traiangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        for(int i=1;i<=input1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
