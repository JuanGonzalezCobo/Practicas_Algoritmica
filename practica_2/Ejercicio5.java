package Practica2;

import java.util.Scanner;

public class Ejercicio5 {

	public static long ackerman(long m, long n) {
		
		if (m < 0 || n < 0) {
	        throw new IllegalArgumentException("Los números deben ser no negativos.");
	    }
		
		if (m == 0) {
			return n + 1;
		} else if (m != 0 && n == 0) {
			return ackerman(m - 1, 1);
		} else {
			return ackerman(m - 1, ackerman(m, n - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("--- Ackerman ---");

		System.out.print("Introduce m: ");
		long m = entrada.nextInt();
		while (m < 0) {
			System.out.println("Valor no válido. El número debe de ser positivo.");
			System.out.print("Introduce m: ");
			m = entrada.nextInt();
		}
		System.out.print("Introduce n: ");
		long  n = entrada.nextInt();
		while (n < 0) {
			System.out.println("Valor no válido. El número debe de ser positivo.");
			System.out.print("Introduce n: ");
			n = entrada.nextInt();
		}

		long resultado = ackerman(m, n);

		System.out.println("La función de Ackerman con m = " + m + ", n = " + n + " es " + resultado);
		entrada.close();
	}

}
