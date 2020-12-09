package unidad4;

import java.util.Scanner;

public class Ej14ArrayLeeAlmacena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Programa que utilice un único array para leer y almacenar los datos de varias secuencias de números
//		enteros. Los datos se introducirán por teclado de la forma siguiente:
//		• Se escribe una primera línea que contiene el número de secuencias.
//		• A continuación, se escriben las secuencias a razón de dos líneas por secuencia con el formato
//		siguiente:
//		o La primera contiene la cantidad de números de la secuencia.
//		o La segunda contiene los números de la secuencia separados por espacios.

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas secuencias tendra el array?");

		int secuencias = sc.nextInt();

		int[][] vector;

		int cantidad;

		vector = new int[secuencias][];

		// para hacer esto debo sacarlo fuera del array de lo contrario me da error,
		// seria [][][]¿?¿? preguntar
		System.out.println("cuantos numeros tendra esta secuencia?");

		cantidad = sc.nextInt();

		vector = new int[secuencias][cantidad];

		for (int i = 0; i < vector.length; i++) {

			for (int j = 0; j < cantidad; j++) {
				System.out.println("introduzca los numeros de la secuencia");
				vector[i][j] = sc.nextInt();
			}
		}

		sc.close();

		for (int k = 0; k < vector.length; k++) {
			for (int l = 0; l < vector[k].length; l++) {
				System.out.println(vector[k][l]);
			}
			System.out.println();
		}
	}

}
