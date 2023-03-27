package H_W.HW_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.printf("Введите число: ");
       int num = sc.nextInt();
       int sumnums = 0;
       int fact = 1;
       int i = 1;
       while (i <= num) {
        sumnums += i;
        fact *= i; 
        i++;
       }
       System.out.println(sumnums);
       System.out.println(fact);
       sc.close();
    }
}
