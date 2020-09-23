package HomeWork_2;

import java.util.Scanner;

public class Array {
    public static class MainClass {

        public static void main(String[] args) {
            int row;
            int column;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter values for a two-dimensional array. Choose the size. Row and Column: ");
            row = sc.nextInt();
            column = sc.nextInt();

            String[][] newArray = new String[row][column];
            createArr(newArray, sc, row, column);
            System.out.println("Sum is " + +calcArr(newArray, row, column));
        }

        private static void createArr(String[][] array, Scanner sc, int row, int column) {
            if (row != 4 || column != 4) try {
                throw new MyArraySizeException(row, column);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
            System.out.println("Create Array ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println("New row " + i + " column " + j);
                    array[i][j] = sc.next();
                }
            }
            printArr(array);
            calcArr(array, row, column);
        }

        private static int calcArr(String[][] array, int row, int column) {
            int sum = 0;
            int[][] arrayInt = new int[row][column];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        arrayInt[i][j] = Integer.parseInt(array[i][j]);
                        sum += arrayInt[i][j];
                    } catch (NumberFormatException e) {
                        try {
                            throw new MyArrayDataException(i, j);
                        } catch (MyArrayDataException myArrayDataException) {
                            myArrayDataException.printStackTrace();
                        }
                    }
                }
            }
            printArrInt(arrayInt);
            return sum;
        }

        private static void printArr(String[][] array) {
            for (String[] strings : array) {
                for (String string : strings) {
                    System.out.print(string);
                }
                System.out.println();
            }
        }

        private static void printArrInt(int[][] array) {
            System.out.println("This is arr Int ");
            for (int[] ints : array) {
                for (int anInt : ints) {
                    System.out.print(anInt);
                }
                System.out.println();
            }
        }
    }
}
