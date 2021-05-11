package ru.geekbrains.lesson3stage2;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        String[] arr = {"aa", "bb", "cc", "aa", "bb", "ff", "dd", "ff", "ee", "aa"};
        HashMap<String, Integer> elementsAndRepeats = new HashMap<>();
        ArrayList<String> uniqueArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            elementsAndRepeats.put(arr[i], 0);
        }

        for (Map.Entry<String, Integer> o : elementsAndRepeats.entrySet()) {
            for (int i = 0; i < arr.length; i++) {
                if (o.getKey().equals(arr[i])) {
                    elementsAndRepeats.put(o.getKey(), (o.getValue()+1));
                }
            }
            if (o.getValue() < 2) {
                uniqueArray.add(o.getKey());
            }
        }
        System.out.println("Список уникальных элементов: " + uniqueArray);
        System.out.println("Кол-во повторений каждого элемента в коллекции: " + elementsAndRepeats);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров", 89173434);
        phoneBook.add("Иванов", 89173435);
        phoneBook.add("Иванов", 89173436);
        phoneBook.add("Иванов", 89173437);
        phoneBook.add("Сидоров", 89173438);
        phoneBook.printInfo();
        phoneBook.get("Иванов");

    }

}
