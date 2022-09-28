import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        StringBuilder b = new StringBuilder();
        b.append(a);
        b = b.reverse();

        System.out.println(b);
    }
}