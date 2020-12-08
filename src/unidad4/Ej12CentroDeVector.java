package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ej12CentroDeVector {

	Random rnd = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int tamanio = rnd.nextInt(10 - 1 + 1) + 1;
		int[] vector;
		String tieneCentro;
		vector = new int[tamanio];
		// rellenamos
		for (int i = 0; i < vector.length; i++) {

			System.out.printf("Introduce el numero %d para rellenar el vector\n", (i + 1));

			vector[i] = sc.nextInt();
		}

		sc.close();
		// llamamos al metodo pasandole el vector
		tieneCentro = centro(vector);

		// damos el resultado
		if (tieneCentro == null) {

			System.out.println("El vector no tiene centro");
		} else
			System.out.printf("El vector tiene centro este esta en el indice %d, de un vector de %d posiciones",
					Integer.parseInt(tieneCentro), (vector.length));
	}

	public static String centro(int[] indice) {
		
		//si solo tiene una posicion no consideramos que tenga centro
	    if (indice.length == 1) {
			return null;
		}
		
	    // un vector par no tendra centro
	    else if (indice.length % 2 == 0) {
			return null;
		}

		// uno impar si, estara en la mitad del .length exactamente
		else
			return String.valueOf((indice.length / 2));
	}

}
