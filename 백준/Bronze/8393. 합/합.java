import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= a; i++) {
            result += i;
        }
        System.out.println(result);
    }
}