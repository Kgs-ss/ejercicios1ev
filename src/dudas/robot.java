package dudas;

import java.util.Scanner;
public class robot {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int eleccion = 0;
		//declaramos las variables con el primer valor que nos interesa
		String pelo="pelo";		
		String ojos = "ojos";
		String nariz = "nariz";
		String boca = "boca";
		String barbilla = "barbilla";
			
		String [][] v = {{"WWWWWW","\\\\\\///////","@@@@@@@@@","__#####__","77777777"},
					   {"|  o o  |","| (. .) |", "|  O O  |","| \\  /  |"},
					   {"|   G   |","|   J   |", "G   k   G","!   L   !"},
					   {"@@@---@@@","|  ___  |", "|  ---  |","|  uuu  |"},
					   {"_________", "@@@@@@@@@","LLLLLLLLL","WWWWWWWWW"}
		};
		
		//array con las variables para trabajar con ellas
		String [] variables = {pelo, ojos, nariz, boca, barbilla};
		//recorremos los arrays principales
		for (int i = 0; i < v.length;i++) {	
			//recorremos el interno mostrando los valores almacenados
			for (int j=0;j < v[i].length;j++) {
				
				System.out.println(j + " : " + v[i][j] );
			}
			//pedimos seleccion, variables[i] contiene el valor asignado al principio, lo sobreescribimos
			System.out.println("\nSeleccione " + variables[i] + "\n");
		
			eleccion = sc.nextInt();
			
			variables[i] = v[i][eleccion];
			
		}
		
		System.out.println();
		
		//finalmente imprimimos
		for (int k=0; k < variables.length;k++) {
		
		System.out.println("  " + variables[k]);
		}
		sc.close();
	}
}