package Homework3;

import java.util.*;

public class Main {
    public static void main (String[] args) {
    /**Задача1
     * Реализовать алгоритм сортировки слиянием
     */    
        // int[] array = new int[10];
        // Random random = new Random();
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = random.nextInt(10);
        // }
        // System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.toString(mergeSort(array)));

    /**Задача2
     */
    // delEvenNumbers();

    /**Задача3
     */
    // findNumInArray();
    }

    /**Задача1
     * Реализовать алгоритм сортировки слиянием
     */
    private static int[] mergeSort(int[] array1) {
        int[] buf1 = Arrays.copyOf(array1, array1.length);
        int[] buf2 = new int[array1.length];
        int[] result = mergeSortInner(buf1, buf2, 0, array1.length);
        return result;
    }

    private static int[] mergeSortInner(int[] buf1, int[] buf2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buf1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buf1, buf2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buf1, buf2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buf1 ? buf2 : buf1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }



    /**Задача2
     * Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    private static void delEvenNumbers() {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(20);
            array.add(value);
        }
        System.out.println(Arrays.asList(array));

        for (int i = 0; i < array.size(); ) {
            if(array.get(i) % 2 == 0) {
                array.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.asList(array));
    }



    /**задача3
     * Задан целочисленный список ArrayList. 
     * Найти минимальное, максимальное и среднее из этого списка
     */
    public static void findNumInArray() {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(20);
            array.add(value);
        }
        System.out.println(Arrays.asList(array));

        int max = array.get(0);
        int min = array.get(0);
        int middle = 0;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) > max) {
                max = array.get(i);
            }
            if(array.get(i) < min) {
                min = array.get(i);
            }
            middle = middle + array.get(i);
        }
        middle = middle / array.size();
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("Middle number: " + middle);
    }
}


        

