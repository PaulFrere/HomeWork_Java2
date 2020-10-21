package HomeWork_3;

class Phone {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", 123456);
        phoneBook.add("Petrov", 234567);
        phoneBook.add("Sidorov", 345678);
        phoneBook.add("Ivanov", 456789);
        phoneBook.add("Sergeev", 567890);

        phoneBook.get();

    }
}
