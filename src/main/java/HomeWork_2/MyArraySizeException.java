package HomeWork_2;

public class MyArraySizeException extends Throwable {
    public MyArraySizeException(int row, int column) {
    }

    public void printStackTrace() {
        System.out.println("Wrong size!");
    }
}
