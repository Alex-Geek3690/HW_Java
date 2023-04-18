package H_W.HW_5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class task_2 {
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Светлана Петрова", "Кристина Белова", "Анна Мусина", 
        "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
        "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников","Петр Петин", "Иван Ежов"));
        for (String names : list) {
            if (employees.containsKey(Array.get(names.split(" "), 0))) {
                int count = employees.get(Array.get(names.split(" "), 0));
                employees.put((String)Array.get(names.split(" "), 0), count + 1);
            } else {
                employees.put((String)Array.get(names.split(" "), 0), 1);
            }
        }
        System.out.println(employees);
        Map<String, Integer> sort_employees = employees.entrySet()
                                                        .stream()
                                                        .sorted(Collections
                                                        .reverseOrder(Map.Entry.comparingByValue()))
                                                        .collect(Collectors
                                                        .toMap(Map.Entry::getKey, 
                                                                Map.Entry::getValue, 
                                                                (e1, e2) -> e1, 
                                                                LinkedHashMap::new));
        System.out.println(sort_employees);
    }
}
