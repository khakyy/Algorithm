import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList list = new ArrayList();

        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        System.out.println(list.get(1));
    }
}