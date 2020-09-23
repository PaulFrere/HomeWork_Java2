package HomeWork_2;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int i, int j) {
    }
    public void printStackTrace() {
        System.out.println("\n" +
                "Not a number entered");
    }
}
