package H_W.HW_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петров получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task_2 {
    public static void main(String[] args) throws Exception {
        File file = new File("file_task_2.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        fr.close();
        br.close();
       
        StringBuilder new_line = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != '"' && line.charAt(i) == ':') {
                new_line.append(',');
            } else {
                new_line.append(line.charAt(i));
            }
        }
        String[] array = new_line.toString().split(",");
        System.out.println("студент" + array[1] + "получил" + array[3] + "по предмету" + array[5] + ".");

    }
}
