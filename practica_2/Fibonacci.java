import java.util.Scanner;

public class Fibonacci {
    private static final Scanner TECLADO = new Scanner(System.in);
    public static long fibonacci(long n) {
        return (n <= 1) ?  n : fibonacci(n-1) + fibonacci(n-2);
    }


    public static void main(String[] args) {
        System.out.print("Introduzca la posición del numero Fibonacci que quieres ver: ");
        int numeroElegido;
        while ((numeroElegido = TECLADO.nextInt()) < 0) {
            System.out.println("Error: Quiero un numero positivo:");
        }

        System.out.printf("La posición %d tiene el numero %d", numeroElegido, fibonacci(numeroElegido));
    }
}
