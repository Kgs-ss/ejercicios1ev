package unidad4;

import java.util.Scanner;

public class Ej1cuentaVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una palabra o frase");
		String cadena = sc.next();
		cadena = cadena.toLowerCase();
		char comprueba;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		for (int j = 0; j < cadena.length(); j++) {
			comprueba = cadena.charAt(j);
			if (comprueba == 'a')
				a++;
			else if (comprueba == 'e')
				e++;
			else if (comprueba == 'i')
				i++;
			else if (comprueba == 'o')
				o++;
			else if (comprueba == 'u')
				u++;
		}

		System.out.printf("La cadena tiene: \n %d a\n %d e\n %d i\n %d o\n %d u", a, e, i, o, u);

		sc.close();
	}

}
