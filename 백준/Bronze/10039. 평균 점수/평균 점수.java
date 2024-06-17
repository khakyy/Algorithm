import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = 0;

        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            if (a < 40) {
                a = 40;
            }
            b += a;
        }

        System.out.println(b / 5);
        
    }
}