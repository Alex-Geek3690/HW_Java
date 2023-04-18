package H_W.HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите 1) Добавление номера, 2) Вывод всего, stop - выход: ");
            String oper = sc.next();
            switch (oper) {
                case "1": {
                    System.out.println("Введите фамилию: ");
                    String name = sc.next();
                    System.out.println("Введите номер: ");
                    String number = sc.next();
                    list.add(number);
                    map.put(name, list);
                    break;
                }
                case "2": {
                    System.out.println(map);
                    break;
                }
                case "stop": {
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("Введена некорректная команда");
                    return;
                }
            }

        }
    }
}