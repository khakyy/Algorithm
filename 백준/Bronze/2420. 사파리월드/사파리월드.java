import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long a = scanner.nextLong();
        Long b = scanner.nextLong();

        System.out.println(Math.abs(a - b));
    }
}