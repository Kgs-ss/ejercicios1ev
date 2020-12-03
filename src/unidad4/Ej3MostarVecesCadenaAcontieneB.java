package unidad4;

import java.util.Scanner;

public class Ej3MostarVecesCadenaAcontieneB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int veces = 0;
		String texto = "";

		System.out.println("introduzca la primera cadena");
		String cadena1 = sc.nextLine();
		cadena1 = cadena1.toLowerCase();
		texto = cadena1;
		System.out.println("introduzca la segunda cadena");

		String cadena2 = sc.nextLine();
		cadena2 = cadena2.toLowerCase();

		if (cadena1.length() < cadena2.length()) {

			System.out.println("la cadena 1 no contiene la cadena 2");
		}

		else

			while (texto.indexOf(cadena2) > -1) {
				// usamos texto para almacenar un substring que va desde donde acaba la primera
				// ocurrencia hasta el final
				// en la segunda iteracon texto sera una substring recortada que almacenare el
				// texto restante
				// ejemplo hohoho, it1 = texto hohoho, substring hoho, it2, texto hoho, substrin
				// ho, it3 ho, substring "" acaba el bucle
				texto = texto.substring(texto.indexOf(cadena2) + cadena2.length(), texto.length());
				veces++;

			}

		System.out.println("cadena 1: " + cadena1);
		System.out.println("cadena 2: " + cadena2);
		System.out.printf("La cadena 1 con tiene %d veces la cadena 2", veces);

		sc.close();
	}

}
