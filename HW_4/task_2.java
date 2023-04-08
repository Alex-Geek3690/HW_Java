package H_W.HW_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(list);

        enquenue(list);
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        first(list);
        System.out.println(list);
    }

    public static void enquenue(LinkedList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        list.add(num);
        sc.close();
    }

    public static void dequeue(LinkedList<Integer> list) {
        System.out.println(list.removeFirst());
    }

    public static void first(LinkedList<Integer> list) {
        System.out.println(list.getFirst());
    }
}
