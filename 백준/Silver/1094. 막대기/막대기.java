import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int stick = 64;
        int b = 0;

        while (a > 0) {
            if (stick > a) {
                stick /= 2;
            } else {
                a -= stick;
                b++;
            }
        }
        System.out.println(b);
    }
}