//Пользователь вводит с клавиатуры строку. Произ-
//		ведите поворот строк и полученный результат выведите
//		на экран.
import java.util.Scanner;

public class Task_01_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		System.out.println(word);
		
	}
}