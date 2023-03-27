package H_W.HW_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = sc.nextInt();
        boolean simple = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.print(i + " ");
                sc.close();
            } else {
                simple = true;
            }
        }
    }
}

// for (int i = 2; i < n; i++) {
// int count = 0;
// for (int j = 2; j <= i && count < 2; j++) {
// if (i % j == 0) {
// count++;
// }
// }
// if (count < 2) {
// System.out.print(i + " ");
// sc.close();
// }
// }
// }
// }