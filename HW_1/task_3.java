package H_W.HW_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num_1 = sc.nextDouble();
        double num_2 = sc.nextDouble();
        double result;
        System.out.print("Введите знак: ");
        String sign = sc.next();

        if (sign.equals("+")) {
            result = num_1 + num_2;
            System.out.println(result);
        } else if (sign.equals("-")) {
            result = num_1 - num_2;
            System.out.println(result);
        } else if (sign.equals("*")) {
            result = num_1 * num_2;
            System.out.println(result);
        } else if (sign.equals("/")) {
            if (num_2 != 0) {
                result = num_1 / num_2;
                System.out.println(result);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        } else {
            System.out.println("Введен некорректный знак, введите снова");
        }
        sc.close();
    }
}

// public class task_3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double num_1 = sc.nextDouble();
//         double num_2 = sc.nextDouble();
//         double result;
//         System.out.print("Введите знак: ");
//         String sign = sc.next();

//         switch (sign) {
//             case "+": {
//                 result = num_1 + num_2;
//                 System.out.println(result);
//                 break;
//             }
//             case "-": {
//                 result = num_1 - num_2;
//                 System.out.println(result);
//                 break;
//             }
//             case "*": {
//                 result = num_1 * num_2;
//                 System.out.println(result);
//                 break;
//             }
//             case "/": {
//                 if (num_2 != 0) {
//                     result = num_1 / num_2;
//                     System.out.println(result);
//                     break;
//                 } else {
//                     System.out.println("На ноль делить нельзя");
//                 }
//             }
//             default:
//                 System.out.println("Введен некорректный знак, введите снова");
//         }
//         sc.close();
//     }
// }