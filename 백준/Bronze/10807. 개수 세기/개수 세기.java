import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] v = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            v[i] = scanner.nextInt();
        }

        int equalNum = scanner.nextInt();
        for (int j = 0; j < N; j++) {
            if (equalNum == v[j]) {
                result++;
            }
        }
        System.out.println(result);
    }

}