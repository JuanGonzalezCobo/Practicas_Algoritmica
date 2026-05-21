package Practica3;

import java.util.Random;

public class MatrizEnterosCuadrada {

	private int [][]matriz;
	
	public MatrizEnterosCuadrada(int numeroFilasCol) {
		matriz = new int[numeroFilasCol][numeroFilasCol];
		
		Random random = new Random();
		
		for (int i = 0; i < numeroFilasCol; i++) {
			for (int j = 0; j < numeroFilasCol; j++) {
				matriz[i][j] = random.nextInt(100);
			}
		}
	}
	
	public MatrizEnterosCuadrada(int [][]m) {
		int n = m.length;
		matriz = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			System.arraycopy(m[i], 0, matriz[i], 0, n);
		}
	}
	
	public static void ordenacionSeleccion(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndice = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndice]) {
					minIndice = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndice];
			array[minIndice] = temp;
		}
	}
	
	public MatrizEnterosCuadrada matrizOrdenadaPorFilas() {
		int n = matriz.length;
		int [][]nuevaMatriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			System.arraycopy(matriz[i], 0, nuevaMatriz[i], 0, n);
			ordenacionSeleccion(nuevaMatriz[i]);
		}
		
		return new MatrizEnterosCuadrada(nuevaMatriz);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				sb.append(matriz[i][j]);
				sb.append("\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}