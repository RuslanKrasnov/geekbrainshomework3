package ru.geekbrains.lesson3stage2;

import java.util.*;

public class PhoneBook{
    private HashMap<String, HashSet<Integer>> book = new HashMap<>();

    public void add(String surname, int num) {
            if (book.containsKey(surname)) {
                HashSet<Integer> hs = new HashSet<>();
                hs = book.get(surname);
                hs.add(num);
                book.put(surname, hs);
                } else {
                HashSet<Integer> hs = new HashSet<>();
                hs.add(num);
                book.put(surname, hs);
            }
    }

    public void get(String surname) {
        if (book.containsKey(surname)) {
            System.out.println("Телефон человека по фамилии " + surname + " " + book.get(surname));
        } else {
            System.out.println("Такой фамилии в справочнике нет!");
        }
    }

    public void printInfo() {
        System.out.println(book);
    }

}
