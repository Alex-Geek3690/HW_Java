package H_W.HW_5;

import java.util.HashMap;
import java.util.Map;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
// И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class task_3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        place_ferz(map, 0);
        board(map);
    }

    public static void board(Map<Integer, Integer> map) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int position = i * 8 + j;
                if (map.containsKey(position)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static boolean pos_ferz(Map<Integer, Integer> map, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            if (map.containsKey(i * 8 + columns)) {
                return false;
            }
        }
        for (int i = rows, j = columns; i >= 0 && j >= 0; i--, j--) {
            if (map.containsKey(i * 8 + j)) {
                return false;
            }
        }
        for (int i = rows, j = columns; i >= 0 && j < 8; i--, j++) {
            if (map.containsKey(i * 8 + j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean place_ferz(Map<Integer, Integer> map, int rows) {
        if (rows == 8) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            if (pos_ferz(map, rows, i)) {
                map.put(rows * 8 + i, 1);
                if (place_ferz(map, rows + 1)) {
                return true;
            }
        }
            map.remove(rows * 8 + i);
        }
        return false;
    }
}
