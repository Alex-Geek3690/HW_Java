package H_W.HW_2;

import java.io.File;
import java.io.FileWriter;

// К калькулятору добавить логирование

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        String file = "file_3.txt";
        File calc_file = new File(file);

        try {
            FileWriter writer_calc = new FileWriter(calc_file, false);

            Scanner sc = new Scanner(System.in);
            double num_1 = sc.nextDouble();
            double num_2 = sc.nextDouble();
            double result;
            System.out.print("Введите знак: ");
            String sign = sc.next();
            sc.close();

            if (sign.equals("+")) {
                result = num_1 + num_2;
                writer_calc.write(String.valueOf(result));
                System.out.println(num_1 + "+" + num_2 + "=" + result);
            } else if (sign.equals("-")) {
                result = num_1 - num_2;
                writer_calc.write(String.valueOf(result));
                System.out.println(num_1 + "-" + num_2 + "=" + result);
            } else if (sign.equals("*")) {
                result = num_1 * num_2;
                writer_calc.write(String.valueOf(result));
                System.out.println(num_1 + "*" + num_2 + "=" + result);
            } else if (sign.equals("/")) {
                if (num_2 != 0) {
                    result = num_1 / num_2;
                    writer_calc.write(String.valueOf(result));
                    System.out.println(num_1 + "/" + num_2 + "=" + result);
                } else {
                    System.out.println("На ноль делить нельзя");
                }
            } else {
                System.out.println("Введен некорректный знак, введите снова");
            }
            writer_calc.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }
}
