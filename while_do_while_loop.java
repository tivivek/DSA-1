package vivekfirstcode;

public class while_do_while_loop {
    public static void main(String[] args) {
      /* int a = 0;
        while (a<=5)
        {
            System.out.println(a);
            a++;
        } */

        // Do while example when condition is not true

        System.out.println("Even if condition is false loop will run for one time");
        int b = 10;
        do
        {
            System.out.println(b);
            b++;
        } while (b<5);
        //another example

        System.out.println("when condition is true");

        int c = 0;
        do
        {
            System.out.println(c);
            c++;
        } while (c<5);
    }
}
