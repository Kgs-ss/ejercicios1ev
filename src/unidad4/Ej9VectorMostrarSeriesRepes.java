package unidad4;

import java.util.Random;

public class Ej9VectorMostrarSeriesRepes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Programa que realice las tareas siguientes:
//			• Crear un vector de números enteros de un tamaño aleatorio entre 10 y 500 elementos.
//			• Llenar el vector con números aleatorios comprendidos entre -100 y 100.
//			• Mostrar el contenido del vector si su tamaño es menor o igual a 50.
//			• Mostrar, independientemente del tamaño del vector, el número de secuencias de números
//			repetidos.

		Random rnd = new Random();
		int cuentaRepetidos = 0;
		boolean estaRepetido = false;
		int secuenciasRepes = 0;

		// creamos y rellenamos vector con numeros aleatorios
		int[] vector;

		vector = new int[rnd.nextInt(500 - 10 + 1) + 10];

		for (int i = 0; i < vector.length; i++) {

			vector[i] = rnd.nextInt(100 - (-100) + 1) - 100;
		}

		// mostramos contenido si es menor o igual a 50
		System.out.println("tamaño : " + vector.length);

		if (vector.length <= 50) {

			for (int muestra : vector) {

				System.out.println(muestra);
			}
		}

		System.out.println("Numeros repetidos: ");

		// recoremos el vector
		for (int j = 0; j < vector.length - 1; j++) {
			// por cada numeros miramos cuantas veces se repite y vamos aumentando j para
			// que no compruebe de nuevo
			while (vector[j] == vector[j + 1] && j < vector.length) {
				estaRepetido = true;
				cuentaRepetidos++;
				j++;
			}
			// si uno se repite entra aqui y muestra cual y las veces que se repite
			if (estaRepetido) {
				System.out.println(vector[j] + " se repite " + (cuentaRepetidos + 1) + " veces");
				cuentaRepetidos = 0;
				secuenciasRepes++;
				estaRepetido = false;
			}
		}
		// por ultimo mostramos el numero de secuencias repetidas
		System.out.println("Hay " + secuenciasRepes + " secuencias repetidas");

	}

}
