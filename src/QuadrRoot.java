import java.util.Scanner;

//Получаем целый вадратный корень числа, если его нет, вернем -1

public class QuadrRoot {
	
	static Scanner in = null;

	public static void main(String[] args) throws Exception {
		in = new Scanner(System.in);  // инициализируем класс для чтения данных с консоли
	
        squareRoot(); 
		
		in.close();  // закрываем поток ввода

		
	}
	
	public static int getSquareRoot(int number) {
		for (int i = number; i > 0; i--) {
			if (i * i == number) {
				return i;
			}
		}

		return -1;
	}

	// Вычисляем квадратные корни введенных чисел.
	 
	public static void squareRoot() throws Exception {

		while (true) {
			System.out.print("Введите число (для прекращения ввода введите 0) : "); // сообщение
																					// о
																					// вводе
																					// числа.

			int number = in.nextInt(); // читаем число.

			if (number == 0) { // если 0, выходим.
				break;
			}

			if (number < 0) { // если число < 0, выведем сообщение с ошибкой.
				System.out.println("Введенное число должно быть больше 0.");
				continue;
			}

			int root = getSquareRoot(number); // получаем корень числа.

			if (root > 0) { // выводим ответ.
				System.out.printf("Корень числа %d = %d\n", number, root);
			} else {
				System.out.printf("У числа %d нет целочисленного квадратного корня.\n", number);
			}
		}
	}

}
