package unidad4;

import java.util.Random;

public class Ej13MatrizAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Programa que cree una matriz de números enteros aleatorios con un número de filas y de columnas
//		aleatorios que estén comprendidos entre 2 y 20.
//		Escribir un método que reciba una matriz de números enteros y retorne un vector que contenga la suma de
//		los valores de cada fila.
//		Escribir otro método que reciba una matriz de números enteros y retorne un vector que contenga la suma
//		de los valores de cada columna.
//		Mostrar en la consola la matriz, la suma de las filas a su derecha y la suma de las columnas en la parte
//		inferior.

		Random rnd = new Random();

		int columnas = rnd.nextInt(20 - 2 + 1) + 2;
		int filas = rnd.nextInt(20 - 2 + 1) + 2;
		int[][] vector;
		int[] vectorFilas;
		int[] vectorColumnas;
		vector = new int[columnas][filas];

		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {

				vector[i][j] = rnd.nextInt();
			}
		}
		System.out.println(vector.length);
		System.out.println(vector[0].length);

		vectorFilas = new int[vector.length];
		vectorFilas = a(vector);

		System.out.println("la suma de las diferentes filas del vector de como resultado");
		for (int k = 0; k < vectorFilas.length; k++) {
			System.out.println("fila: " + (k + 1) + " suma de la fila: " + vectorFilas[k]);
		}

		System.out.println();
		System.out.println();

		vectorColumnas = new int[vector.length];
		vectorColumnas = columnas(vector);

		System.out.println("La suma de las diferentes columnas da como resultado el siguiente vector:");

		for (int l = 0; l < vectorColumnas.length; l++) {

			System.out.println("columna " + (l + 1) + " total: " + vectorColumnas[l]);
		}

	}

	// filas
	public static int[] a(int[][] b) {

		int[] vectorFilas;
		int sumaFilas;
		vectorFilas = new int[b.length];

		for (int i = 0; i < b.length; i++) {
			sumaFilas = 0;
			for (int j = 0; j < b[i].length; j++) {
				sumaFilas = sumaFilas + b[i][j];
			}
			vectorFilas[i] = sumaFilas;
		}

		return vectorFilas;

	}

	// columnas
	// ¿?¿?¿?¿?¿ NO :W
	// Cuando filas es menor qu columnas out of bounds MIRAAAAR
	public static int[] columnas(int[][] colum) {
		int[] vectorColumnas;
		int sumaColumnas;
		vectorColumnas = new int[colum[0].length];
		//System.out.println(vectorColumnas.length + " tamaño");
		//aqui igualar a tamaño de i MALA JUGADA joder, igualar a un tamaño FIJOOOOOOOOOO!!!!!!!!!! fk
		for (int i = 0; i < colum[0].length; i++) {

			sumaColumnas = 0;
			for (int j = 0; j < colum.length; j++) {

				sumaColumnas = sumaColumnas + colum[j][i];
			}
			vectorColumnas[i] = sumaColumnas;
		}
		return vectorColumnas;

	}

}
