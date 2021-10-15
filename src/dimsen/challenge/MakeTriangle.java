package dimsen.challenge;

import java.util.Scanner;

public class MakeTriangle {
    public int repetition;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many repetition? ");
        repetition = scanner.nextInt();
    }

    public void triangle() {
        for (int i = 0; i<repetition; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
