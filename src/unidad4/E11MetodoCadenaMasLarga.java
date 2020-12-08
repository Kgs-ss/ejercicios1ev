package unidad4;

import java.util.Scanner;

public class E11MetodoCadenaMasLarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] cadenas;
		cadenas = new String[10];
		for (int i = 0; i < cadenas.length; i++) {
			System.out.println("Introduzca el nombre " + (i + 1) + " para rellenar el array");
			cadenas[i] = sc.nextLine();
		}
		sc.close();
		String masLarga;
		masLarga = cadenaLarga(cadenas);
		System.out.println("El nombre mas largo es " + masLarga);
	}

	// EL primer valor es lo que va a devolver un String en este caso, el valor
	// entre parentesis es lo que le va a llegar un vector de Strings
	public static String cadenaLarga(String[] a) {
		String cadena;
		String cadenaADevolver = "";
		// retorna el mas largo como se pide, pero si hay 2 iguales solo retornara uno,
		// habria que modificarlo, de todas formas cumple con lo pedido, seguimos
		for (int i = 0; i < a.length; i++) {

			cadena = a[i];
			if (cadena.length() > cadenaADevolver.length()) {
				cadenaADevolver = cadena;
			}

		}

		return cadenaADevolver;
	}

}
