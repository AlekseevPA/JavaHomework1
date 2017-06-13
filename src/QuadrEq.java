// Квадратное уравнение

import java.util.Scanner;

public class QuadrEq {

	static Scanner in = null;

	public static void main(String[] args) throws Exception {
		in = new Scanner(System.in); // инициализируем класс для чтения данных с консоли

		quadraticEquation(); 
		quadraticEquation(); 
		quadraticEquation(); 
					
		in.close(); // закрываем поток ввода

	}

	// Вычисляем квадратное уравнение.
	 
	public static void quadraticEquation() {
		double a, b, c; // коеф. уравнения

		// пока a == 0, будем требовать ввод коректного значения
		do {
			System.out.print("Введите a: "); // выводим сообщения для ввода
			a = in.nextDouble(); // читаем a с консоли
			if (a == 0) { // если a == 0, будем выдавать такое сообщение
				System.out.println("Первый коэффициент не может быть 0.");
			}
		} while (a == 0);

		// читаем b
		System.out.print("Введите b: ");
		b = in.nextDouble();

		// читаем c
		System.out.print("Введите c: ");
		c = in.nextDouble();


		double d = b * b - 4 * a * c; // вычисляем дискриминант

		if (d < 0) { // если нет корней
			System.out.println("Уравнение не имеет действительных корней.");
		} else if (d > 0) { // если есть корни, вычисляем их
			double x1 = (-b - Math.sqrt(d)) / (2 * a);
			double x2 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.printf("Корни уравнения: x1 = %.2f, x2 = %.2f\n", x1, x2); // выводим
																					// ответ
		} else { // если только 1 корень
			double x = -b / (2 * a);
			System.out.printf("Уравнение имеет единственный корень: x = %.2f\n", x);
		}

	}
}
        

