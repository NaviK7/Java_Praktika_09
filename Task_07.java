import java.util.Arrays;
import java.util.Scanner;

//Пользователь с клавиатуры вводит элементы одномер-
//        ного массива и некоторое число. Необходимо посчитать
//        сколько раз данное число присутствует в массиве.
public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Input  numbers  array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter a number to search for");
        int search = scanner.nextInt();
        int n = 0;

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
            if (array[j] == search) {
                n++;
            }

        }System.out.println();
        System.out.println("Количество совпадений " + n);
    }
}

