package H_W.HW_4;

import java.util.Scanner;
import java.util.Stack;

public class task_3_1 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        st.push(number);
        int result = 0;
        while (true) {

            System.out.println(
                    "Введите символ (+, -, *, /) -> арифм. операция, cancel -> возврат к предыдущему ответу, stop -> выход: ");
            String oper = sc.next();

            switch (oper) {
                case "+": {
                    System.out.println("Введите число: ");
                    number = sc.nextInt();
                    result = st.lastElement() + number;
                    System.out.println(result);
                    st.push(result);
                    break;
                }
                case "-": {
                    System.out.println("Введите число: ");
                    number = sc.nextInt();
                    result = st.lastElement() - number;
                    System.out.println(result);
                    st.push(result);
                    break;
                }
                case "*": {
                    System.out.println("Введите число: ");
                    number = sc.nextInt();
                    result = st.lastElement() * number;
                    System.out.println(result);
                    st.push(result);
                    break;
                }
                case "/": {
                    System.out.println("Введите число: ");
                    number = sc.nextInt();
                    result = st.lastElement() / number;
                    System.out.println(result);
                    st.push(result);
                    break;
                }
                case "cancel": {
                    if (st.size() > 1) {
                        st.pop();
                        System.out.println(st.lastElement());
                    } else {
                        System.out.println("осталось первое число " + st.lastElement());
                    }
                    break;
                }
                case "stop": {
                    sc.close();
                    return;
                }
            }
        }
    }
}
