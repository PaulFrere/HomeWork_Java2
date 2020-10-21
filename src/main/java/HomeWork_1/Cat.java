package HomeWork_1;

public class Cat implements Treadmill, Wall {
    private final String name;
    private final int run;
    private final double jump;

    public Cat(String name, int run, double jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public void info() {
        System.out.println(this.name + " может пробежать " + this.run + "м и перепрыгнуть высоту " + this.jump + "м.");
        if (run >= MaxRun) {
            System.out.println(this.name + " Пробежал: " + MaxRun + "m.");
            if (jump >= MaxJump){
                System.out.println(this.name + "Перепрыгнул: " + MaxJump + "m.");
            }else System.out.println(this.name + " не смог перепрыгнуть стену - слишком высоко.");
        } else System.out.println(this.name + " не смог пробежать, слишком длинная дистанция.");
    }
}