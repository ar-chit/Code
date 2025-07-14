import java.util.Scanner;

public class chararray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        char ch[] = new char[length];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.println("Index: " + i + " value: " + ch[i]);

        }
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

        System.out.println(" ");
        System.out.println(ch);
        int billa = (int) ch[0];
        System.out.println(billa);
        System.out.println(ch.length);
        sc.close();
    }
}
