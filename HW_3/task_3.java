package H_W.HW_3;

import java.util.ArrayList;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(20));
        }
        System.out.println(list);

        list.sort(null);
        System.out.println("min_number = " + list.get(0));
        System.out.println("max_number = " + list.get(list.size() - 1));
      
        int sum = 0;
        for (Integer iter : list) {
            sum += iter;
        }
        System.out.println(sum + "/" + list.size() + "=" + (double) sum / list.size()); 
    }
}
