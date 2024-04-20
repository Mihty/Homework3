package org.example;
public class Main {
    public static void main(String[] args) {
        // 1 завдання
        int[] numbers = {1, 2, 3, 4, 5};
        StringBuilder numbersString = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            numbersString.append(numbers[i]);
            if (i < numbers.length - 1) {
                numbersString.append(";");
            }
        }
        System.out.println("Завдання 1: ");
        System.out.println(numbersString.toString());
        // 2 завдання
        System.out.println("Завдання 2: ");
        String phrase = "Мама мила раму";
        String[] words = phrase.split(" ");
        System.out.println("Слова у фразі:");
        for (String word : words) {
            System.out.println(word);
        }

        // 3 завдання
        System.out.println("Завдання 3: ");
        String text = "Я хочу перенесення рядків.";
        String replacedText = text.replaceAll(" ", "\n");
        System.out.println(replacedText);
    }
}
