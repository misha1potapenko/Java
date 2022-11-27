//В файле содержится строка с исходными данными в такой форме:
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//        Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//        SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
//
//        Для разбора строки используйте String.split.
//        Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\misha\\IdeaProjects\\secondSem\\semSecondString\\src\\text.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            String[] words = line.split(" ");
            System.out.println(line);
            for (String word : words) {
                System.out.println(word);
            }
//            while (line != null) {
//                System.out.println(line);
//                // считываем остальные строки в цикле
//                line = reader.readLine();
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}