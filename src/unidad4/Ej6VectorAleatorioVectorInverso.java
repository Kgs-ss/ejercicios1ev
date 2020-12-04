package unidad4;

import java.util.Random;

public class Ej6VectorAleatorioVectorInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aleatorio;
		int[] inverso;
		// Math random no crea negativos, usar clase Random
		Random rnd = new Random();
		int tamanio = rnd.nextInt(50 - 10 + 1) + 10;
		int contador = 0;
		int numRandom;
		boolean entra = false;
		aleatorio = new int[tamanio];
		inverso = new int[tamanio];

		// rellenamos con aleatorios
		for (int i = 0; i < aleatorio.length; i++) {

			numRandom = rnd.nextInt(100 - (-100) + 1) - 100;
			// comprobamos que no esta el numero en ninguna de las posiciones anteriores
			for (int correcto = 0; correcto < i; correcto++) {

				if (aleatorio[correcto] == numRandom) {

					entra = false;
					break;
				}

				else

					entra = true;
			}
			// asignamos si es el primero o finaliza entra en true
			if (i == 0) {

				aleatorio[i] = numRandom;
			}

			else if (entra) {

				aleatorio[i] = numRandom;
				entra = false;
			}
			// Si no finaliza en true repetimos la iteracion restando uno a i y generamos un
			// nuevo valor aleatorio hasta que lo encuentre
			else if (!entra)

				i--;

		}
		//rellenamos el array inverso 
		for (int j = tamanio - 1; j >= 0; j--) {

			inverso[j] = aleatorio[contador];
			contador++;

		}
		//mostramos ambos arrays
		for (int k = 0; k < aleatorio.length; k++) {

			System.out.printf("array1 posicion %d: %d || array 2 posicion %d: %d\n", k, aleatorio[k], k, inverso[k]);
		}

	}

}
