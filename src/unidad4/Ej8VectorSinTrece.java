package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ej8VectorSinTrece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Programa que realice las tareas siguientes:
//			• Crear un vector de números enteros de un tamaño especificado por el usuario que estará
//			comprendido entre 10 y 200 elementos.
//			• Llenar el vector con números aleatorios comprendidos entre -100 y 100.
//			• Mostrar la suma de los números almacenados teniendo en cuenta que hay quien piensa que el
//			número 13 es el número de la mala suerte. Por tanto, si en alguna posición se encuentra
//			almacenado el número 13, no se sumará ni este número ni los que se encuentren almacenados en
//			las 13 posiciones siguientes (o las que haya hasta el final del vector si estas son menos de 13) si la
//			suma de todos ellos es distinta de 7.
//			• Mostrar el contenido del vector y la cantidad de números que no se han sumado.

		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		// indica el tamaño del vector que sera introducido por el usuario
		int tamanio;
		// donde generaremos los numeros y comprobaremos con ello si se repite en el
		// vector
		int aleatorio;
		// creamos el vector
		int[] vector;
		// comprobamos si no esta repetido, si no esta repetido entra
		boolean entra = false;
		// tras rellenar el vector sumamos los numeros que se piden y los alamcenamos
		// aqui
		int suma = 0;
		// la cantidad de numeros almacenados
		int veces = 0;
		// comprueba si son igual a 7 los numeros "descartados"
		int sumaSiete = 0;
		// Lo usamos para un bucle interno que comprueba las posiciones siguientes para
		// ver que hacemos con ellas
		int contadorSiete;
		// indica si sumaSiete es = a 7
		boolean siete = false;
		int salta = 0;

		// pedimos un numero que debe estar entre 10 y 200
		do {

			System.out.println("Dime el tamaño del vector, debe estar entre 10 y 200");
			tamanio = sc.nextInt();

		} while (tamanio < 10 || tamanio > 200);

		sc.close();

		// le damos el tamaño al vector
		vector = new int[tamanio];

		// rellenamos el vector comprobando que no se repita ninguno como en los
		// anteriores
		for (int i = 0; i < tamanio; i++) {

			aleatorio = rnd.nextInt(100 - (-100) + 1) - 100;

			for (int correcto = 0; correcto < i; correcto++) {

				if (vector[correcto] == aleatorio) {

					entra = false;
					break;

				}

				else
					entra = true;

			}

			if (i == 0) {

				vector[i] = aleatorio;
			}

			else if (entra) {

				vector[i] = aleatorio;
				entra = false;
			}

			else if (!entra) {

				i--;
			}

		}

		// aqui haremos la suma de los numeros y haremos la excepcion del 13 y sus
		// numeros siguientes
		for (int sumados = 0; sumados < vector.length; sumados++) {

			// cuando sea igual a siete se complica
			if (vector[sumados] == 13) {

				// lo primero segun aparezca un 13 comprobamos las 13 posiciones siguientes
				for (contadorSiete = sumados; contadorSiete < (contadorSiete + 13); contadorSiete++) {

					sumaSiete = sumaSiete + vector[contadorSiete];
					// podria exceder el tamaño del vector ej 13 ultima posicion del vector, si pasa
					// eso rompemos para que no de fallo
					if (contadorSiete >= vector.length - 1) {
						break;
					}
				}

				// si podemos ir 13 posiciones hacia arriba mientras sea distinta de 7 la suma
				// de las posiciones restantes, las aumentamos
				if ((sumados + 13) < vector.length && sumaSiete != 7) {

					sumados += 13;

				}
				//Faltaba decirle que hace cuando es distinto de 7 pero no quedan mas de trece espacios hasta el final
				else if ((sumados + 13) >= vector.length &&  sumaSiete != 7) {
					
					salta = vector.length - sumados;
					sumados = sumados + salta;
					
				}
				// si es siete debemos marcarlo para usarlo luego en la comprobacion de los
				// numeros de la suma
				else if ((sumaSiete == 7))

					siete = true;

			}
			// si no hay un 13 sumamos, si despues del 13 sumamos un 7 sumamos, si sigue
			// sumamos
			else if (vector[sumados] != 13 || siete) {

				suma = suma + vector[sumados];
				veces++;
			}

		}

		// mostramos vector

		for (int k = 0; k < vector.length; k++) {

			System.out.printf("posicion %d: %d\n", k, vector[k]);
		}

		System.out.println("Los numeros que no se han sumado han sido: " + (vector.length - veces));
		System.out.printf("La suma total de los numeros es de %d", suma);

	}

}
