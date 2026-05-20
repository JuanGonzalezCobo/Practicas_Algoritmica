package practica2;
import java.util.Scanner;
public class MCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m, n;
		
		do {
			System.out.print("Ingrese el valor de m: ");
			m = sc.nextInt();
			System.out.print("Ingrese el valor de n: ");
			n = sc.nextInt();
			
			if (m <= 0 || n <= 0) {
				System.out.println("Ambos números deben ser enteros positivos. Por favor, intente de nuevo.");
			}
		} while (m <= 0 || n <= 0);
		
		int resultado = mcd(m, n);
		System.out.println("El máximo común divisor de " + m + " y " + n + " es " + resultado);
	}
	
	public static int mcd(int m, int n) {
		if (n <= m && m % n == 0) {
			return n;
		} else if (m < n) {
			return mcd(n, m);
		} else {
			return mcd(n, m % n);
		}
	}

}
