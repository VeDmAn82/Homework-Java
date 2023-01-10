package Homework5;

import java.util.Arrays;

import static Homework5.ListStaff.getListStaff;

public class Main {
    public static void main(String[] args) {
        // findPhoneNumber();
        // findRepeatFirstName();
        // getHeapSort();
        
    }

    /**Задача1
     * Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
     * что 1 человек может иметь несколько телефонов.
     */
    private static void findPhoneNumber() {
        Phonebook user = new Phonebook();
        user.add("Иванов", "1234567");
        user.add("Петров", "7654321");
        user.add("Сидоров", "6543217");
        user.add("Васильев", "5432167");
        user.add("Сидоров", "4321567");

        System.out.println(user.find("Сидоров"));
    }



    /**Задача2
     * Пусть дан список сотрудников:
     * Написать программу, которая найдет и выведет повторяющиеся имена
     * с количеством повторений. Отсортировать по убыванию популярности.
     */
    private static void findRepeatFirstName() {
        ListStaff people = new ListStaff();
        people.add("Иван", "Иванов");
        people.add("Светлана", "Петрова");
        people.add("Кристина", "Белова");
        people.add("Анна", "Мусина");
        people.add("Анна", "Крутова");
        people.add("Иван", "Юрин");
        people.add("Петр", "Лыков");
        people.add("Павел", "Чернов");
        people.add("Петр", "Чернышов");
        people.add("Мария", "Федорова");
        people.add("Марина", "Светлова");
        people.add("Мария", "Савина");
        people.add("Мария", "Рыкова");
        people.add("Марина", "Лугова");
        people.add("Анна", "Владимирова");
        people.add("Иван", "Мечников");
        people.add("Петр", "Петин");
        people.add("Иван", "Ежов");

        getListStaff();
    }



    /**Задача3
     * Реализовать алгоритм пирамидальной сортировки (HeapSort)
     */
    private static void getHeapSort() {
        int array[] = {1, 5, 2, 45, 22, 4, 87, 3, 58};
        HeapSort number = new HeapSort();
        number.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}



  