package unidad2;

import java.io.InputStreamReader;
import java.io.*;

public class Conversor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//entrada de valores sin clase escaner
		
		float euros;
		float dolares;
		String linea;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero: ");
		linea = in.readLine();
		euros = Float.parseFloat(linea);
		dolares = euros * 1.17f;
		System.out.printf("%-15.2f", dolares);
		
		

	}

}
