package H_W.HW_3;

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> new_list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            list.add(random.nextInt(15));
        }
        System.out.println(list);

        for (Integer iter : list) {
            if (iter % 2 == 1) {
                new_list.add(iter);
            }
        }
        System.out.println(new_list);
      
    }
}
