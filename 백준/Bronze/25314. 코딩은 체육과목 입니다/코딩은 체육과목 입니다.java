import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b  = a / 4;

        if (b != 0) {
            for (int i = 0; i < b; i++) {
                if (b > 0) {
                    System.out.print("long ");
                }
            }
            System.out.println("int");
        }
    }
}