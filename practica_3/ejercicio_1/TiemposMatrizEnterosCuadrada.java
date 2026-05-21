package Practica3;

public class TiemposMatrizEnterosCuadrada {

	public static void main(String[] args) {
		final int MAX_ITERATIONS = 10;
		
		for (int n = 32; n <= 8192; n = n * 2) {
			long[] tiempos = new long[MAX_ITERATIONS];
			
			for (int i = 0; i < MAX_ITERATIONS; i++) {
				MatrizEnterosCuadrada m = new MatrizEnterosCuadrada(n);
				
				long tiempoInicial = System.nanoTime();
				MatrizEnterosCuadrada ordenada = m.matrizOrdenadaPorFilas();
				long tiempoFinal = System.nanoTime();
				
				tiempos[i] = tiempoFinal - tiempoInicial;
				//System.out.println(tiempos[i]);
			}
			
			long maximo = tiempos[0];
			long suma = tiempos[0];
			for (int i = 1; i < MAX_ITERATIONS; i++) {
				if(tiempos[i] > maximo) {
					maximo = tiempos[i];
				}
				suma = suma + tiempos[i];
			}
			suma = suma - maximo;
			
			double media = (double) suma / (MAX_ITERATIONS - 1);
			
			System.out.printf("%d %.4f\n", n, media);
		}
	}
}