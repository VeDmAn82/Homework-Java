package Homework5;

import java.util.HashMap;
import java.util.ArrayList;

public class ListStaff {
    private static HashMap<String, ArrayList<String>> people = new HashMap<>();

    public void add (String firstName, String lastName) {
        if(people.containsKey(firstName)) {
            people.get(firstName).add(lastName);
        } else {
            ArrayList<String> values = new ArrayList<>();
            values.add(lastName);
            people.put(firstName,values);
        }
    }

    public static void getListStaff() {
        String[] arrayNames = new String[people.size()];
        people.keySet().toArray(arrayNames);
        int[] arraySizeNames = new int[people.size()];
        for (int i = 0; i < arrayNames.length; i++) {
            int sizeName = people.get(arrayNames[i]).size();
            arraySizeNames[i] = sizeName;
        }

        boolean isSorted = false;
        int valueNumber;
        String valueName;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arraySizeNames.length-1; i++) {
                if(arraySizeNames[i] < arraySizeNames[i+1]) {
                    isSorted = false;
                    valueNumber = arraySizeNames[i];
                    arraySizeNames[i] = arraySizeNames[i+1];
                    arraySizeNames[i+1] = valueNumber;
                    valueName = arrayNames[i];
                    arrayNames[i] = arrayNames[i+1];
                    arrayNames[i+1] = valueName;
                }
            }
        }
        for (int i = 0; i < arrayNames.length; i++) {
            for (int j = 0; j < arraySizeNames[i]; j++) {
                System.out.print(arrayNames[i] + " ");
                String[] arrayLastName = new String[arraySizeNames[i]];
                people.get(arrayNames[i]).toArray(arrayLastName);
                System.out.println(arrayLastName[j]);
            }
            System.out.println("Имя " + arrayNames[i] + " повторяется " + arraySizeNames[i] + " раз");
            System.out.println();
        }
    }  
}
