import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            String b = scanner.next();

            if (b.length() < 6 || b.length() > 9) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }

    }
}