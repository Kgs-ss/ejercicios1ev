package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ej7VectorEntreDiezUnMillon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] vector;
		int tamanioVec;
		int numeroAle;
		boolean isOk = false;
		int menor = 0;
		int mayor = 0;
		int diferencia;
		double tiempoDiferencia;
		double tiempoRelleno;
		long inicio;
		long fin;
		
		do {
			System.out.println("Cuantos elementos tendra el vector");
			tamanioVec = sc.nextInt();
		} while (tamanioVec < 10 || tamanioVec > 1000000);
		
		sc.close();
		
		vector = new int[tamanioVec];
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < tamanioVec; i++) {
			

			numeroAle = rnd.nextInt(1000000 - (-999999) + 1) - 999999;
			//numRandom = rnd.nextInt(100 - (-100) + 1) - 100;
			if (i == 0) {
				menor = numeroAle;
				mayor = numeroAle;
			}
			for (int correcto = 0; correcto < i; correcto++) {

				if (vector[correcto] == numeroAle) {

					isOk = false;
					break;
				} 
				
				else {

					isOk = true;
					if (numeroAle < menor) {
						
						menor = numeroAle;
					}
					
					else if (numeroAle > mayor) {
						
						mayor = numeroAle;
					}
				}

			}

			if (i == 0) {

				vector[i] = numeroAle;
			}

			else if (isOk) {

				vector[i] = numeroAle;
				isOk = false;
			}

			else
				i--;
		}
		fin = System.currentTimeMillis();
		tiempoRelleno = fin - inicio;
		inicio = System.currentTimeMillis();
		diferencia = mayor - menor;
		fin = System.currentTimeMillis();
		tiempoDiferencia = fin - inicio;
		System.out.println("EL tamaño del vector es de " + vector.length);
		System.out.println("EL vector ha tardado en rellenarse " + tiempoRelleno + " milisegundos");	
		System.out.printf("El menor es %d el mayor %d y la diferencia entre ambos numeros es de : %d\n", menor, mayor , diferencia);
		System.out.println("La diferencia se ha calculado en " + tiempoDiferencia + " milisegundos");

	}

}
