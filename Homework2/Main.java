package Homework2;

import org.json.JSONArray;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        // №1
        // String str = "{\"name\": \"Ivanov\", \"country\": \"Russia\", \"city\": \"Moscow\", \"age\": \"null\"}";
        // System.out.println(SQLRequest(str));

        // №2
        // bubbleSort();

        // №3
        // Grades();

        

    }

    /**Задача1
     * Дана строка sql-запроса "select * from students where ".
     * Сформируйте часть WHERE этого запроса, используя StringBuilder.
     * Данные для фильтрации приведены в виде json строки
     */
    private static String SQLRequest(String request) {
        request = request.substring(1, request.length() - 1);
        System.out.println(request);

        String[] part = request.split(", ");

        StringBuilder SQLrequest = new StringBuilder("SELECT * FROM students WHERE");

        for (int i = 0; i < part.length; i++) {
            String[] pair = part[i].split(":");
            String value = pair[1];

            if (!value.equals("\"null\"")) {
                String key = pair[0].substring(1, pair[0].length() - 1);

                if (i != 0) {
                    SQLrequest.append(" ,");
                }
                SQLrequest.append(" ").append(key).append(" - ").append(value);
            }
        }
        return SQLrequest.toString();
    }


    /**Задача2
     * Реализуйте алгоритм сортировки пузырьком числового
     * массива, результат после каждой итерации запишите в лог-файл.
     */
    private static void bubbleSort() {

        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } 

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int n,array[];
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            n = in.nextInt();
            array = new int [n];
            for (int i = 0; i < array.length; i++)
                array[i] = (int) ( Math.random() * n);
            for (int i: array)
                System.out.print(i + " ");
                System.out.println();

        int temp;
        boolean sort = true;
        while(sort) {
            sort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    sort = true;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;   
                }
                logger.info(Arrays.toString(array));
            }
            System.out.println(Arrays.toString(array));
        }
    }
    

    /**Задача3
     * Дана json строка (можно сохранить в файл и читать из файла)
     * Написать метод(ы), который распарсит json и, используя StringBuilder,
     * создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет] 
     */
    public static void Grades()
    {
        JSONArray students = new JSONArray("[" +
                "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
        for (int i = 0; i < students.length(); i++)
        {
            StringBuilder lastName = new StringBuilder((String) students.getJSONObject(i).get("фамилия"));
            StringBuilder grade = new StringBuilder((String) students.getJSONObject(i).get("оценка"));
            StringBuilder subject = new StringBuilder((String) students.getJSONObject(i).get("предмет"));
            System.out.println("Студент " + lastName + " получил " + grade + " по предмету " + subject);
        }
    }
}


    






