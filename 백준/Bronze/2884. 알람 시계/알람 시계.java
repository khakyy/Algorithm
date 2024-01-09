import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b >= 45) {
            System.out.print(a + " " + (b - 45));
        } else if (a == 0){
            a = 23;
            System.out.print(a + " " + (60 - (45 - b)));
        } else {
            System.out.print(a - 1 + " " + (60 - (45 - b)));
        }
    }
}