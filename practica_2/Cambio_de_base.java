package practica2;
import java.util.Scanner;
public class Cambio_de_base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero, base;
			
		System.out.print("Introduce el número decimal: ");
        numero = sc.nextInt();
        System.out.print("Introduce la base (2-16): ");
        base = sc.nextInt();

        if (numero < 0 || base < 2 || base > 16) {
        	
            System.out.println("Entrada no válida.");
            
        } else {
            String resultado = CambioBase(numero, base);
            System.out.println("El número en base " + base + " es: " + resultado);
        }
	}
	
	public static String CambioBase(int num, int base) {
        String digitos = "0123456789ABCDEF";      
        if (num < base) {     	
            return String.valueOf(digitos.charAt(num));       
        } else {
            return CambioBase(num / base, base) + digitos.charAt(num % base);
        }
	}
}

  