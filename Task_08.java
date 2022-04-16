import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//В одномерном массиве, заполненном случайными
//        числами, определить минимальный и максимальный
//        элементы, посчитать количество отрицательных элемен-
//        тов, посчитать количество положительных элементов,
//        посчитать количество нулей. Результаты вывести на
//        экран.
public class Task_08 {
    public static void main(String[] args) {

        Random random = new Random();


        int[] array = new int[10];
        System.out.println("Input  numbers  array");
        for (int i = 0; i < array.length; i++) {
    //        array[i] = (int) (Math.random() * 100) - 50;
            array[i] =random.nextInt(100)-50;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println("Min is: " + min);

        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }
        System.out.println("Max is: " + max);

        int sum = 0;
        for (int k = 0; k < array.length; k++) {
            sum += array[k];
        }
        double ad = (double) sum / array.length;
        System.out.println("Среднее ариметическое = " + ad);

        int negativ = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                negativ++;
            }
        }
        System.out.println("Количество отрицательных чиселл " + negativ);

        int pozitiv = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                pozitiv++;
            }
        }
        System.out.println("Количество положительных  чисел " + pozitiv);

        int zero = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) {
                zero++;
            }
        }
        System.out.println("Количество нулей " + zero);
    }

}

