// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package H_W.HW_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Notebook nb1 = new Notebook("HP", "Black", 16, 500, "Windows");
        Notebook nb2 = new Notebook("Dell", "White", 16, 500, "Windows");
        Notebook nb3 = new Notebook("Apple", "Gold", 32, 1024, "MacOS");
        Notebook nb4 = new Notebook("HP", "Black", 8, 500, "Windows");
        Notebook nb5 = new Notebook("Asus", "Grey", 8, 500, "Linux");

        HashSet<Notebook> set = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5));
        // for (var item : set) {
        // System.out.println(item);
        // }
        sort_notebok(set, select_par());
    }

    public static HashMap<String, Object> select_par() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> map = new HashMap<>();
        map.put("os", "");
        map.put("ram", 0);
        map.put("hdd", 0);
        map.put("color", "");
        while (true) {
            System.out.println(
                    "Введите номер соответствующего параметра для подбора модели ноутбука: 1 - os(операционная система); 2 - ram(объем оперативной памяти); 3 - hdd(объем жесткого диска); 4 - coolor(цвет); 0 - завершить подбор ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println(
                            "Введите номер выбранной операционной системы: 1 - Windows; 2 - Linux; 3 - MacOS ");
                    int num_os = sc.nextInt();
                    switch (num_os) {
                        case 1:
                            map.put("os", "Windows");
                            break;
                        case 2:
                            map.put("os", "Linux");
                            break;
                        case 3:
                            map.put("os", "MacOS");
                            break;

                        default:
                            System.out.println("Введен неверный номер");
                            break;
                    }
                    break;
                case 2:
                    System.out.println(
                            "Ввведите номер выбранного объема оперативной памяти: 1 - 8Gb; 2 - 16Gb; 3 - 32Gb ");
                    int num_ram = sc.nextInt();
                    switch (num_ram) {
                        case 1:
                            map.put("ram", 8);
                            break;
                        case 2:
                            map.put("ram", 16);
                            break;
                        case 3:
                            map.put("ram", 32);
                            break;
                        default:
                            System.out.println("Введен неверный номер");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Введите номер выбранного объема жесткого диска: 1 - 500Gb; 2 - 1024Gb ");
                    int num_hdd = sc.nextInt();
                    switch (num_hdd) {
                        case 1:
                            map.put("hdd", 500);
                            break;
                        case 2:
                            map.put("hdd", 1024);
                            break;
                        default:
                            System.out.println("Введен неверный номер");
                            break;
                    }
                    break;
                case 4:
                    System.out.println(
                            "Введите номер выбранного цвета ноутбука: 1 - черный; 2 - белый; 3 - золотой; 4 - серый ");
                    int num_color = sc.nextInt();
                    switch (num_color) {
                        case 1:
                            map.put("color", "Black");
                            break;
                        case 2:
                            map.put("color", "White");
                            break;
                        case 3:
                            map.put("color", "Gold");
                            break;
                        case 4:
                            map.put("color", "Grey");
                            break;

                        default:
                            System.out.println("Введен неверный номер");
                            break;
                    }
                    break;
                case 0:
                    System.out.println(map);
                    sc.close();
                    return map;
                default:
                    System.out.println("Введен неверный номер параметра");
                    break;
            }

        }
    }

    public static void sort_notebok(HashSet<Notebook> set, HashMap<String, Object> select_par) {
        HashSet<Notebook> list_nb = new HashSet<>();
        for (Notebook item : set) {
            if (item.getRam() >= (Integer) select_par.get("ram") && item.getHdd() >= (Integer) select_par.get("hdd") &&
                (item.getOs().equals((String) select_par.get("os")) || select_par.get("os").equals("")) &&
                    (item.getColor().equals((String) select_par.get("color")) || select_par.get("color").equals(""))) {
                list_nb.add(item);
            }
        }
        if (list_nb.size() == 0) {
            System.out.println("Подходящий ноутбук не найден");
        } else {
            for (var item : list_nb) {
                System.out.println(item);
            }
        }
    }
}
