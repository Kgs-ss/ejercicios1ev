package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ej10VectorDiferenciaAdyacentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int[] vector;
		int tamanio;
		int diferenciaMinima;
		int positivo1;
		int positivo2;
		do {
			System.out.println("Introduzca el tamaño que tendre el vvector");
			tamanio = sc.nextInt();
		} while (tamanio < 10 || tamanio > 20);
		sc.close();
		vector = new int[tamanio];
		// rellenamos
		for (int i = 0; i < vector.length; i++)
			// esta linea para ser positivo podria haber sido vector[i] = vector[i] >= 0 ?
			// vector[i] : vector[i] * (-1), asi aseguramos valores positivos y ahorrariamos
			// codigo mas adelante, ademas puede que quedase mas claro
			vector[i] = rnd.nextInt();
		// mostramos
		for (int j = 0; j < vector.length; j++)
			System.out.println(vector[j]);
		// buscamos la diferencia minima entre 2 valores adyacentes, suponemos que esta
		// debe ser con valores absolutos?
		diferenciaMinima = vector[0] - vector[1];
		// dejamos la diferencia en positivo en caso que no lo sea
		if (diferenciaMinima < 0)
			diferenciaMinima = diferenciaMinima * (-1);
		// vamos comparando
		for (int k = 1; k < vector.length - 1; k++) {
			// almacenamos en positivo1 y 2 los numeros del array en positivo
			positivo1 = vector[k] >= 0 ? vector[k] : (vector[k] * (-1));
			positivo2 = vector[k + 1] >= 0 ? vector[k + 1] : (vector[k + 1] * (-1));
			// sacamos la diferencia
			if (positivo1 >= positivo2 && (positivo1 - positivo2) < diferenciaMinima)

				diferenciaMinima = positivo1 - positivo2;

			else if (positivo2 > positivo1 && (positivo2 - positivo1) < diferenciaMinima)

				diferenciaMinima = positivo2 - positivo1;

		}
		System.out.println("La diferencia minima es : " + diferenciaMinima);

	}

}
