import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a == 1 || a == 2) {
            for (int i = 0; i < a; i++) {
                System.out.println("SciComLove");
            }
        }

    }
}