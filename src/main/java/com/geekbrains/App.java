package com.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<String> arrayOfWords = new ArrayList<>();
        arrayOfWords.add("Cat");
        arrayOfWords.add("Cat");
        arrayOfWords.add("Dog");
        arrayOfWords.add("Cherry");
        arrayOfWords.add("Potato");
        arrayOfWords.add("State");
        arrayOfWords.add("Potato");
        arrayOfWords.add("Dog");
        arrayOfWords.add("Chance");
        arrayOfWords.add("Ten");
        arrayOfWords.add("Home");

        Map<String, Integer>  countOfWordsMap = new HashMap<>();

        for (String arrayOfWord : arrayOfWords) {
            countOfWordsMap.put(arrayOfWord, (countOfWordsMap.get(arrayOfWord)==null)?1:(countOfWordsMap.get(arrayOfWord)+1) );
        }

        for (String s : countOfWordsMap.keySet()) {
            if (countOfWordsMap.get(s) == 1)
                System.out.println(s);
        }

        for (String s : countOfWordsMap.keySet()) {
            System.out.println("Слово " + s + " встречается в массиве " + countOfWordsMap.get(s) + " раз");
        }
    }
}
