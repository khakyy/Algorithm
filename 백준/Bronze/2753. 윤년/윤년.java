import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 4 == 0) {
            if (a % 100 != 0) {
                System.out.println("1");
            } else if (a % 400 == 0) {
                System.out.println("1");
                if (a % 400 != 0) {
                    System.out.println("0");
                }
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
