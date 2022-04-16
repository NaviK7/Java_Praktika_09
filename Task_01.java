//Пользователь вводит с клавиатуры строку. Произ-
//		ведите поворот строк и полученный результат выведите
//		на экран.
import java.util.Scanner;

public class Task_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		for (int i = 1, k = 0; i <= word.length() & k < word.length(); i++, k++) {
			int a = word.length();
			String rever = word.substring(a - i, a - k);
			System.out.print(rever);
		}
	}
}