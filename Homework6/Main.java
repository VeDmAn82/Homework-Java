package Homework6;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        filterSelection(parameterSelection());
    }

    /**
     *  1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
     *  2. Создать множество ноутбуков.
     *  3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
     *  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
     *  “Введите цифру, соответствующую необходимому критерию:
     *  1 - ОЗУ
     *  2 - Объем ЖД
     *  3 - Операционная система
     *  4 - Цвет …
     *   1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
     *   2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */
    private static Set<Object> getLaptopSet() {
        Laptop laptop = new Laptop("Asus", 4, 250, "Windows 7", "Black");
        Laptop laptop1 = new Laptop("HP", 8, 150, "Windows 10", "Black");
        Laptop laptop2 = new Laptop("Acer", 8, 250, "Windows 8", "White");
        Laptop laptop3 = new Laptop("Lenovo", 6, 500, "Windows 10", "Gray");
        Laptop laptop4 = new Laptop("Samsung", 4, 200, "Windows 7", "Black");
        
        Set<Object> setLaptop = new HashSet<>();
        setLaptop.add(laptop);
        setLaptop.add(laptop1);
        setLaptop.add(laptop2);
        setLaptop.add(laptop3);
        setLaptop.add(laptop4);

        return setLaptop;
    }

    private static int parameterSelection() {
        Map<Integer, String> criterion = new HashMap<Integer, String>();
        criterion.put(1, "ОЗУ");
        criterion.put(2, "Объем ЖД");
        criterion.put(3, "Операционная система");
        criterion.put(4, "Цвет");

        System.out.println("Параметры для выбора ноутбука: " + "\n" + criterion);
        System.out.print("Введите выбранное значение: ");
        Scanner scanner = new Scanner(System.in);
        int selectedCriterion = scanner.nextInt();
        return selectedCriterion;
    }

    private static void filterSelection(int selectedCriterion) {
        if (selectedCriterion == 1) {
            filter1(getLaptopSet());
        }
        else if (selectedCriterion == 2) {
            filter2(getLaptopSet());
        }
        else if (selectedCriterion == 3) {
            filter3(getLaptopSet());
        }
        else if (selectedCriterion == 4) {
            filter4(getLaptopSet());
        }
        else System.out.println("Ошибка ввода ");
    }

    private static void filter1(Set<Object> setLaptop) {
        System.out.print("Введите объем ОЗУ (4, 6, 8): ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String sizeRam = "ram=" + size;
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(sizeRam)) {
                System.out.println(item);
            }
        }
    }

    private static void filter2(Set<Object> setLaptop) {
        System.out.print("Введите объем ЖД (150, 200, 250, 500): ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String sizeSsd = "ssd=" + size;
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(sizeSsd)) {
                System.out.println(item);
            }
        }
    }

    private static void filter3(Set<Object> setLaptop) {
        System.out.println("1 - Windows 7" + "\n" + "2 - Windows 8" + "\n" + "3 - Windows 10");
        System.out.print("Введите ОС: ");
        Scanner scanner = new Scanner(System.in);
        int selectedOs = scanner.nextInt();
        String os = null;
        if (selectedOs == 1) {
            os = "Windows 7";
        } else if (selectedOs == 2) {
            os = "Windows 8";
        } else if (selectedOs == 3) {
            os = "Windows 10";
        }
        else System.out.println("Ошибка ввода ");
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(os)) {
                System.out.println(item);
            }
        }
    }

    private static void filter4(Set<Object> setLaptop) {
        System.out.println("1 - Black" + "\n" + "2 - White" + "\n" + "3 - Gray");
        System.out.println("Введите выбранный цвет: ");
        Scanner scanner = new Scanner(System.in);
        int selectedColor = scanner.nextInt();
        String color = null;
        if (selectedColor == 1) {
            color = "Black";
        } else if (selectedColor == 2) {
            color = "White";
        } else if (selectedColor == 3) {
            color = "Gray";
        }
        else System.out.println("Ошибка ввода ");
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(color)){
                System.out.println(item);
            }
        }
    }
}
