import java.util.Scanner;

/**
 * Created on 25.12.2020
 *
 * @author me
 */
public class Task3 {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Выберете действие (1 - запустить калькулятор, 2 - поиск самого длинного слова в масссиве): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            runCalculator();
        } else if (choice == 2) {
            findTheLongestWordInArray();
        } else {
            System.out.println("Не выбрано правильное действие.");
        }
        scanner.close();
    }

    /**
     * Запускает выполнение калькулятора.
     */
    public static void runCalculator() {
        System.out.print("Введите первое число: ");
        double first = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double second = scanner.nextDouble();
        System.out.print("Выберете операцию (\"+\", \"-\", \"*\", \"/\"): ");
        String operation = scanner.next();
        scanner.close();
        double result = 0;
        if ("+".equals(operation)) {
            result = add(first, second);
        } else if ("-".equals(operation)) {
            result = subtract(first, second);
        } else if ("*".equals(operation)) {
            result = multiply(first, second);
        } else if ("/".equals(operation)) {
            result = divide(first, second);
        }
        System.out.printf("%.4f", result);
    }

    /**
     * Собирает слова из консоли в массив и запускает поиск самого длинного слова в массиве и выводит его.
     */
    public static void findTheLongestWordInArray() {
        System.out.print("Задайте размерность массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите слово №" + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }
        System.out.println(findTheLongestWordInArray(words));
    }

    /**
     * Находит самое длинное слово в массиве.
     *
     * @param words массив слов
     * @return самое длинное слово
     */
    public static String findTheLongestWordInArray(String[] words) {
        String theLongestWord = words[0];
        int maxLength = theLongestWord.length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                theLongestWord = words[i];
                maxLength = words[i].length();
            }
        }
        return theLongestWord;
    }

    /**
     * Возвращает сумму дробрых чисел.
     *
     * @param first  первое слагаемое
     * @param second второе слагаемое
     * @return сумма
     */
    private static double add(double first, double second) {
        return first + second;
    }

    /**
     * Возвращает разность дробрых чисел.
     *
     * @param first  уменьшаемое
     * @param second вычитаемое
     * @return разность
     */
    private static double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Возвращает произведение дробрых чисел.
     *
     * @param first  первый множитель
     * @param second второй множитель
     * @return произведение
     */
    private static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Возвращает результат деления дробрых чисел.
     *
     * @param first  делимое
     * @param second делитель
     * @return результат деления
     */
    private static double divide(double first, double second) {
        return first / second;
    }
}
