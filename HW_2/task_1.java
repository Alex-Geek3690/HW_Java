package H_W.HW_2;

import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива(введен вами), 
// результат после каждой итерации(каждое перемещение элемента) запишите в лог-файл.

public class task_1 {
    public static void main(String[] args) {
        int[] array = new int [] {5, 7, 2, 8, 3, 4, 6};
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            } System.out.println(Arrays.toString(array));
        } 
    }
}
