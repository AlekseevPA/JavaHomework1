//Вывести в консоль все простые числа от 1 до 1000
 
 
public class PrimesNum {
	
	public static void main(String[] args) {
		
		printPrimes(); 
	}
	
	//Проверяем, является ли число простым
	
	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	//Выводим простые числа от 1 до 1000.
	 
	public static void printPrimes() {
		int start = 1, end = 1000; // начало и конец интервала
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) { // если число простое, выведем его
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}
}

