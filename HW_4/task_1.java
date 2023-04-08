package H_W.HW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
// import java.util.Random;


public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> linklist = new LinkedList<>(Arrays.asList(10,3,4,27,24,3,5));
        // LinkedList<Integer> linklist = new LinkedList<>();
        // Random rand = new Random();
        // for (int i = 0; i < 10; i++) {
        //     linklist.add(rand.nextInt(15));
        // }
        System.out.println(linklist);
        System.out.println(reverse_list(linklist));
    }
    private static Deque<Integer> reverse_list(LinkedList<Integer> linklist) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (Integer iter : linklist) {
            dq.offerFirst(iter);
        }
        return dq;
    }
}
