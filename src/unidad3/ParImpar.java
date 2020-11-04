package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un numero: ");
		
		numero = sc.nextInt();
		
		if (numero%2==0 && numero > 0) {
			
			System.out.printf("El numero %d es par", numero);
			
		}
		
		else if (numero%2!=0 && numero > 0) {
			
			System.out.printf("El numero %d es impar", numero);
		}
		
		else 
			
			System.out.printf("El numero es %d", numero);
		
		sc.close();
		
	}

}
