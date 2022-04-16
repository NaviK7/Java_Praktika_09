//Пользователь вводит с клавиатуры строку и слово
//		для поиска. Посчитайте сколько раз в строке встречается
//		искомое слово. Полученное число выведите на экран.

import java.util.Scanner;

public class Task_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter the string");
        String ctroka = scanner.nextLine();
        System.out.println("Inter the search word");
        String word = scanner.next();
        String[] array = ctroka.split(" ");
        int n = 0;
        for (String s : array) {
            if (s.equals(word)) {
                n++;
            }
        }
        System.out.println("Number of coincidences: " +n);
    }
}
