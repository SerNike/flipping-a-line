import java.util.Scanner;

public class NoReverse {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char b[] = a.toCharArray();
        for (int i =b.length-1; i >= 0; i--) {
            System.out.print(b[i]);
        }
    }
}