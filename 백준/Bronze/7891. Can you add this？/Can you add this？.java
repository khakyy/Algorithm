import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            BigDecimal b = scanner.nextBigDecimal();
            BigDecimal c = scanner.nextBigDecimal();

            System.out.println(b.add(c));
        }

    }
}