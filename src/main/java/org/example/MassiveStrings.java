package org.example;

public class MassiveStrings {
    public static void main(String[] args) {
        String str = "Hello world!";

        System.out.println("Перший символ: " + str.charAt(0));
        System.out.println("Останній символ: " + str.charAt(str.length() - 1));

        char[] charArray = str.substring(6, 11).toCharArray();

        System.out.println("Масив символів для слова 'world':");
        for (char i : charArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Попередній елемент масиву: " + charArray[charArray.length - 2]);

        char temp = charArray[0];
        charArray[0] = charArray[1];
        charArray[1] = temp;

        int a = 5;
        int b = 10;
        System.out.println("Початкові значення: a = " + a + ", b = " + b);
        int preIncrementResultA = ++a;
        int postIncrementResultB = b++;
        System.out.println("Після преінкременту: a = " + preIncrementResultA + ", b = " + postIncrementResultB);
        System.out.println("Різниця між ++a та a++: При ++a збільшення відбувається перед використанням, тоді як при a++ збільшення відбувається після використання.");
    }
}