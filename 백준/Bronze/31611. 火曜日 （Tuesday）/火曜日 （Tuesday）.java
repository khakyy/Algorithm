import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a == 2 || a % 7 == 2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}