package HomeWork_1;

public interface Treadmill {
    int MaxRun = (int) (Math.random() * 3000 + 300);

    static void info() {
        System.out.println("Длина забега составляет: " + MaxRun);
    }
}
