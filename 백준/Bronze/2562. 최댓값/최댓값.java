import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int max = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                num = j + 1;
            }
        }

        System.out.println(max);
        System.out.println(num);
    }
}