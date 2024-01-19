import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= b; i++) {
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            result += c * d;
        }
        if (result == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}