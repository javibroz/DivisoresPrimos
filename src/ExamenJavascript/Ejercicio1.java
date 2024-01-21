package ExamenJavascript;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	static int n;

	public static ArrayList<Integer> divisores_de(int n) {

		ArrayList<Integer> arrayDivisores = new ArrayList<>();
		for (int i = 1; i < n; i++) {

			if (n % i == 0) {

				arrayDivisores.add(i);

			}
		}

		return arrayDivisores;

	}

	public static boolean EsPrimo(int n) {
		if (n==1) {return false;}
		int i;
		for (i = 2; i < n; i++)
			if (n % i == 0) {
				return false;
			}

		return true;
	}

	public static void primos() {
		ArrayList<Integer> numeros = divisores_de(n); //
		ArrayList<Integer> primos = new ArrayList<>();
				for (int i = 0; i < numeros.size(); i++) {
             			if (EsPrimo(numeros.get(i))) {
             				primos.add(numeros.get(i));
			            }

		        }
		System.out.println("De esta lista los primos son: " + primos.toString());
	}

	public static void main(String[] args) {
		boolean enRango = false;
		do {
			System.out.println("Dime un número entre 2 y 1000");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
            sc.close();
			if (n >= 2 && n <= 1000) {
				enRango = true;
			}

		} while (enRango == false);
		
 
		System.out.println("Los divisores de tu número son: " + divisores_de(n));
		primos();
	}
}
