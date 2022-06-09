package jana60;

import java.util.Scanner;

public class JavaFizzBuzzBonus {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//dichiarazione variabile
		int num = 0;
		//parametri per la scelta del numero
		while (num < 2 || num > 199) {
			System.out.print("Inserisci un numero da 2 a 199 per giocare a FizzBuzz");
			num = scan.nextInt();
			//scelta del numero corretta
			  if (num > 1 && num < 200) {
				System.out.println("Hai scelto di giocare fino a " + num);
			//scelta del numero errata
			} else {				
				System.out.println("Hai inserito un numero errato, riprova");
			}

		}	scan.close();
		// inserimento contatore numeri da 1 a 100		
		for (int i = 1; i <= num ; i++) {
				// condizione per numeri divisibili per 3 e per 5
				if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				// condizione per numeri divisibili per 3
			}	else if (i % 3 == 0) {
				System.out.println("Fizz");
				// condizione per numeri divisibili per 5
			}	else if (i % 5 == 0) {
				System.out.println("Buzz");
				// il resto dell'elenco
			}	else {
				System.out.println(i);
			}
	
				
}	
}
}