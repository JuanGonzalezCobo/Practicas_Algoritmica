package recursividadAlgoritmica;

import java.util.Scanner;

public class Ejercicio1_P2 {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		int numero;
		System.out.println("Ingrese el numero al cual quieres calcular su factorial: ");
		Scanner sc = new Scanner(System.in);
		while((numero = sc.nextInt())< 0) {
			System.out.println("El numero debe ser positivo");	
			System.out.println("Ingrese el numero al cual quieres calcular su factorial: ");
		}
		System.out.println("El factorial de " + numero + " es: " + factorial(numero));

	}

}
