package vivekfirstcode;

public class reverseOfMyname {
    public static void main(String[] args) {

        String input = "Geeks for Geeks";

        char[] ch = input.toCharArray();
        for (int i = ch.length -1; i > 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
