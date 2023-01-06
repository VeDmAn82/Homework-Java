package Homework4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // getReverseArray();
        // queueLinkedList();
        // cancelLastOperation();
        
    }

    /**Задача1
     * Пусть дан LinkedList с несколькими элементами. 
     * Реализуйте метод, который вернет “перевернутый” список
     */
    private static void getReverseArray() {

        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int value = random.nextInt(10);
            array.add(value);
        }
        System.out.println(array);

        List<Integer> reverseArray = new LinkedList<>();
        for (int i = array.size()-1; i >= 0; i--) {
            reverseArray.add(array.get(i));
        }
        System.out.println(reverseArray);
    }



    /**
     * 2. Реализуйте очередь с помощью LinkedList со следующими методами:
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     */
    private static void queueLinkedList() {
        Deque<Integer> array = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int value = random.nextInt(9);
            array.add(value);
        }
        System.out.println(array);
        enqueue(10, array);
        System.out.println("Помещает элемент в конец очереди");
        System.out.println(array);
        System.out.println("Возвращает и удаляет первый элемент: " + dequeue(array));
        System.out.println(array);
        System.out.println("Возвращает первый элемент без удаления: " + first(array));
        System.out.println(array);
    }
    private static void enqueue(int element, Deque<Integer> queue) {
        queue.addLast(element);
    }
    private static int dequeue(Deque<Integer> queue) {
        return queue.pollFirst();
    }
    private static int first(Deque<Integer> queue) {
        return queue.peekFirst();
    }



    /**Задача3
     * В калькулятор добавьте возможность отменить последнюю операцию
     */
    private static void cancelLastOperation() {
    
        Scanner input = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = reader.nextInt();
        System.out.print("Введите второе число: ");
        int b = reader.nextInt();

        while (true) {
            System.out.print("Введите оператор (+, -, *, /): ");
            switch (input.nextLine()) {
                case ("+"):
                    System.out.println(a + " + " + b + " = " + (a + b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(input.nextLine(), "y")){
                        continue;
                    }
                    return;
                case ("-"):
                    System.out.println(a + " - " + b + " = " + (a - b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(input.nextLine(), "y")){
                        continue;
                    }
                    return;
                case ("*"):
                    System.out.println(a + " * " + b + " = " + (a * b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(input.nextLine(), "y")){
                        continue;
                    }
                    return;
                case ("/"):
                    System.out.println(a + " / " + b + " = " + (a / b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(input.nextLine(), "y")){
                        continue;
                    }
                    return;
                default:
                    System.out.println("Ошибка ввода");
            }
        }
    }
}

















    
    

