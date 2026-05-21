package Practica2;

import java.util.Scanner;

public class Ejercicio4 {
	
	
	public static double legendre (double x, int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		} else {
			return ((2.0*n-1.0)/n) * x * legendre(x, n-1)-(((n-1.0)/n) * legendre(x, n-2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- Polinomio de Legendre ---");
		
		System.out.print("Introduce n: ");
		int n = entrada.nextInt();
			while(n < 0) {
				System.out.println("Valor no válido. El número debe de ser positivo.");
				System.out.print("Introduce un número: ");
				n = entrada.nextInt();
			}
		System.out.print("Introduce x: ");
		double x = entrada.nextInt();
			while(n < 0.0) {
				System.out.println("Valor no válido. El número debe de ser positivo.");
				System.out.print("Introduce un número: ");
				n = entrada.nextInt();
			}
		
		double resultado = legendre(x,n);
		
		System.out.println("El valor del término " + n + " es " + resultado);
		entrada.close();
	}

}


