package vivekfirstcode;
import java.io.*; // for handling input/output
import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void main (String[] args) {

        int length , area;
        Scanner sc = new Scanner(System.in);

        length = sc.nextInt();
        area = length * length;

        System.out.println( "areaofsquare ="+area );

        // Your code here
    }
}
