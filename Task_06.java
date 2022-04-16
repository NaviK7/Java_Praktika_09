import java.util.Arrays;
import java.util.Scanner;

//Пользователь с клавиатуры вводит элементы одно-
//        мерного массива. Необходимо найти сумму элементов
//        массива, среднеарифметическое, отобразить на экран все
//        элементы массива.
public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Input ten numbers  array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int summ = Arrays.stream(array).sum();
        System.out.println("Сумма чисел массива = " + summ);
        double adv = (double) summ / array.length;
        System.out.println("Среднее ариметическое = "+ adv);
        int sum = 0;

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
            sum += array[k];
        }
        System.out.println();
        double ad = (double) sum / array.length;
        System.out.println("Сумма чисел массива = " + sum);
        System.out.println("Среднее ариметическое = "+ ad);

    }
}
