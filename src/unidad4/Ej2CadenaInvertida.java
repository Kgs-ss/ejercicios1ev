package unidad4;

import java.util.Scanner;

public class Ej2CadenaInvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra o frase");
		//nextLine para que pille los espacios
		String cadena = sc.nextLine();
		String alReves = "";
		
		for (int i=cadena.length()-1;i>=0;i--) {
			
			alReves += cadena.charAt(i);
		}
		
		System.out.println("invertida: " + alReves);
		sc.close();
	}

}
