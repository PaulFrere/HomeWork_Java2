package HomeWork_1;

public interface Wall {
    double MaxJump = Math.random() + 1.5;

    static void info() {
        System.out.println("Высота стены составляет: " + MaxJump);
    }
}
