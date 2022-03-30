package com.geekbrains;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+7911111111", "Ivanov");
        phoneBook.add("+7911111112", "Petrov");
        phoneBook.add("+7911111113", "Ivanov");
        phoneBook.add("+7911111114", "Sidorov");
        phoneBook.add("+7911111115", "Sidorov");

        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Sidorov"));
    }

    public void add(String number, String surname) {
        phoneBook.put(number, surname);
    }

    public Set<String> get(String surname) {
        Set<String> numbers = new HashSet<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(surname))
                numbers.add(entry.getKey());
        }
        return numbers;
    }
}
