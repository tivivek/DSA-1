package vivekfirstcode;

public class for_loop {
    public static void main(String[] args) {
       // for (int i = 0; i <=5;i++)
       //     System.out.println(i);

        //decrementing for loop
        //case:1 and case:2 are same,will give same o/p
        //case:1
        System.out.println("o/p of case:1");
        for(int i= 5; i>=0;i--)
            System.out.println(i);
        //case:2
        System.out.println("o/p of case:2");
        for(int i=5; i!=0;i--)
            System.out.println(i);
    }
}
