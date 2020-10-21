package HomeWork_3;

import java.util.*;

public class Words {
    public static void main(String[] args) {
            List<String> words = new ArrayList<>();
            words.add("Стол");
            words.add("Кот");
            words.add("Собака");
            words.add("Стул");
            words.add("Дерево");
            words.add("Змея");
            words.add("Стол");
            words.add("Кот");
            words.add("Стол");
            words.add("Лестница");
            words.add("Карась");
            words.add("Воробей");

        System.out.println("Коллекция: " + words + "\n");

        Set<String> wordsSet = new HashSet<>(words);
        System.out.println("Уникальные слова: " + wordsSet + "\n");

        HashMap<String, Integer> doubleWords = new HashMap<>();
        Integer doubleWord;
        for (String i : words) {

            doubleWord = doubleWords.get(i);
            doubleWords.put(i, doubleWord == null ? 1 : doubleWord + 1);
        }

        System.out.println(doubleWords);
        }
    }

