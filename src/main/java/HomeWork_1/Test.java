package HomeWork_1;

public class Test {

    public static void main(String[] args) {

        Wall.info();

        Treadmill.info();

        Human human1 = new Human("Sergey", 3000, 2.2);
        Human human2 = new Human("Vladimir", 2500, 1.7);

        human1.info();
        human2.info();

        Cyborg cyborg1 = new Cyborg("FR-13", 30000, 5.2);
        Cyborg cyborg2 = new Cyborg("HJ-13", 27000, 6.3);

        cyborg1.info();
        cyborg2.info();

        Cat cat1 = new Cat("Barsik", 600, 2.2);
        Cat cat2 = new Cat("Pushok", 400, 2.5);

        cat1.info();
        cat2.info();
    }
}
