package H_W.HW_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива(введен вами), 
// результат после каждой итерации(каждое перемещение элемента) запишите в лог-файл.

public class task_1 {
    public static void main(String[] args) {
        String sort_file = "file.txt";
        File file = new File(sort_file);
       
        try {
            FileWriter writer_sort = new FileWriter(file, false);
            int[] array = new int [] {5, 7, 2, 8, 3, 4, 6};

            System.out.println(Arrays.toString(array) + "\n");
            writer_sort.write(Arrays.toString(array) + "\n");
            writer_sort.write("\n");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
                writer_sort.write(Arrays.toString(array));
                writer_sort.write("\n");
                System.out.println(Arrays.toString(array));
            } 
            writer_sort.close();
            System.out.println("Получилось!");

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }     
    }
}
