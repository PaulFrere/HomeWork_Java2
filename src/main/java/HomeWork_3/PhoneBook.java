package HomeWork_3;

import java.util.*;

class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1;

    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num1) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num1);

        phoneBook1.put(name, phoneBook);
    }

    void get() {

        System.out.println("Контакт " + "Ivanov: " + phoneBook1.get("Ivanov"));
    }
}
