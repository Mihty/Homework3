package org.example;
public class Massive {
    public static void main(String[] args) {
        // Завдання 1
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array1.length; i++) {
            array1[i] += 10;
        }
        System.out.println("Завдання 1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Завдання 2
        double[] array2 = new double[5];

        System.out.println("Завдання 2: ");
        for (double num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Завдання 3
        byte byteVar = 1;
        int intVar = 100;
        long longVar = 1000L;

        int[] intArray = new int[3];
        // Не можна покласти змінні інших типів в масив int.

        System.out.println("Завдання 3: ");
        System.out.println("byteVar: " + byteVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("intArray: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Завдання 4
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Завдання 4: ");
            for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
