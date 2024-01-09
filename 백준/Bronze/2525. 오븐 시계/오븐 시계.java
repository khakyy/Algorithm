import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        b = a * 60 + b;
        b = b + c;

        a = (b / 60) % 24;
        int min = b % 60;

        System.out.print(a + " " + min);
    }
}