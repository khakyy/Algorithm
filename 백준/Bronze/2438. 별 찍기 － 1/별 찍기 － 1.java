import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String b = "*";

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }

}