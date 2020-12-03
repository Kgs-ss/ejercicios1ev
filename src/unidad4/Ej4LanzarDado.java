package unidad4;

import java.util.Scanner;

public class Ej4LanzarDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas veces se lanzara el dado?");
		int lanzamientos = sc.nextInt();
		sc.close();
		int uno = 0;
		int dos = 0;
		int tres = 0;
		int cuatro = 0;
		int cinco = 0;
		int seis = 0;
		int tirada;

		for (int i = 0; i < lanzamientos; i++) {

			tirada = (int) (Math.random() * 6 + 1);

			if (tirada == 1) {
				uno++;
			} else if (tirada == 2) {
				dos++;
			} else if (tirada == 3) {
				tres++;
			} else if (tirada == 4) {
				cuatro++;
			} else if (tirada == 5) {
				cinco++;
			} else if (tirada == 6) {
				seis++;
			}

		}

		System.out.printf(
				"tras %d lanzamientos han salido los siguientes numeros:\n%d uno/s\n%d dos/es\n%d tres/es\n%d cuatro/s\n%d cinco/s\n%d seis/es", lanzamientos,
				uno, dos, tres, cuatro, cinco, seis);

	}

}
