import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= 0 && a <= 23) {
            if (b >= 0 && b <= 59) {
                System.out.println((a * 60) + b);
            }
        }

    }
}