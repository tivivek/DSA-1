package vivekfirstcode;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inputTaker = new Scanner(System.in);

        //take input from the user until they press 'x' or 'X'
        int ans = 0;

        while (true){
            //take operator as input
            System.out.print("Enter the operator : ");

            char op = inputTaker.next().trim().charAt(0);
            System.out.println();

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //enter two numbers
                System.out.print("Enter Two Numbers: ");

                int num1 = inputTaker.nextInt();
                int num2 = inputTaker.nextInt();
                System.out.println();

                if (op == '+') {

                    ans = num1 + num2;
                }
                if (op == '-') {

                    ans = num1 - num2;
                }
                if (op == '*') {

                    ans = num1 * num2;
                }
                if (op == '/') {

                    if (num2 != 0) {

                        ans = num1 / num2;
                    }
                }
                if (op == '%') {

                    ans = num1 % num2;
                }
            }
            else if (op == 'x'|| op == 'X') {
                    break;
                }
                else {
                    System.out.println("Invalid operation: ");
                }
            System.out.println(ans);
            }

        }
    }
