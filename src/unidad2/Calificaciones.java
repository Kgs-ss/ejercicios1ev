package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int examenM, tarea1M, tarea2M, tarea3M;		//entrada
		int examenF, tarea1F, tarea2F;
		int examenQ, tarea1Q, tarea2Q, tarea3Q;
		
		float mediaM, mediaF, mediaQ, mediaTotal;	//salida
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Nota examen matematicas");
		examenM = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 1 matematicas");
		tarea1M = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 2 matematicas");
		tarea2M = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 3 matematicas");
		tarea3M = Integer.parseInt(in.readLine());
		
		System.out.println("Nota examen quimica");
		examenQ = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 1 quimica");
		tarea1Q = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 2 quimica");
		tarea2Q = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 3 quimica");
		tarea3Q = Integer.parseInt(in.readLine());
		
		System.out.println("Nota examen fisica");
		examenF = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 1 fisica");
		tarea1F = Integer.parseInt(in.readLine());
		System.out.println("Nota tarea 2 fisica");
		tarea2F = Integer.parseInt(in.readLine());
		
		mediaM = examenM * 0.9f + ((tarea1M + tarea2M + tarea3M) / 3) * 0.1f;
		mediaF = examenF * 0.8f + ((tarea1F + tarea2F) / 2) * 0.2f;
		mediaQ = examenQ * 0.85f + ((tarea1Q + tarea2Q + tarea3Q) / 3) * 0.15f;
		
		mediaTotal = (mediaM + mediaF + mediaQ) /3;
		
		
		System.out.printf("la nota media de matematicas es: %.2f"
				+ "\nLa media de fisica es: %.2f, \n"
				+ "La media de quimica es: %.2f\n "
				+ "Y la media final del curso es: %.2f",
				mediaM, mediaF, mediaQ, mediaTotal);
	}

}
