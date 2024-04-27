import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        for (int i = 0; i < 5; i++) {
            int b = scanner.nextInt();
            result += b * b;
        }
        
        System.out.println(result % 10);
    }
}