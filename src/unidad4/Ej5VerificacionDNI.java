package unidad4;

import java.util.Scanner;

public class Ej5VerificacionDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su dni completo");
		String dni = sc.nextLine().toLowerCase();
		char letra = dni.charAt(dni.length()-1);
		String prueba = Character.toString(letra);
		int number = Integer.parseInt(dni.substring(0, dni.length()-1));
		
		String [] letras = {"t", "r", "w", "a", "g", "m", "y", "f", "p", "d", "x", "b", "n", "j", "z", "s", "q", "v", "h", "l", "c", "k", "e"};
		
		if (!prueba.equals(letras[number%23]) || dni.length() !=9) {
			
			System.out.println("el dni " + dni + " no es correcto");
			
		}
		
		else if (prueba.equals(letras[number%23]) && dni.length() ==9)
			 
			System.out.println("el dni " + dni + " es correcto");
		
		sc.close();
	}

}
