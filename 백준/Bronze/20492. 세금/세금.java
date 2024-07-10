import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        System.out.println((int)(a * 0.78) + " " + (int)(a * 0.8 + (a * 0.2 * 0.78)));
    }
}