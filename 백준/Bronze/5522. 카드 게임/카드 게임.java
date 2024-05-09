import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = 0;
        
        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            result += a;
        }
        
        System.out.println(result);
    }
}