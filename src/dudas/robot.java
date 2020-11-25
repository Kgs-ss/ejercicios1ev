package dudas;

import java.util.Scanner;
public class robot {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int eleccion = 0;
		String pelo="";
		String ojos = "";
		String nariz = "";
		String boca = "";
		String barbilla = "";
			
		String [][] v = {{"WWWWWW","\\\\\\////","@@@@@@@@@","__#####__","77777777"},
					   {"|  o o  |","| (. .) |", "|  O O  |","| \\  /  |"},
					   {"|   G   |","|   J   |", "G   k   G","!   L   !"},
					   {"@@@---@@@","|  ___  |", "|  ---  |","|  uuu  |"},
					   {"_________", "@@@@@@@@@","LLLLLLLLL","WWWWWWWWW"}
		};
		
		String [] parte = {"pelo", "ojos","nariz","boca", "barbilla"}; 
		
		for (int i = 0; i < v.length;i++) {
			
			
			for (int j=0;j < v[j].length;j++) {
				
				System.out.println(j + " : " + v[i][j] );
			}
			
			System.out.println("Seleccione " + parte[i]);
		
			eleccion = sc.nextInt();
			
			if (i == 0)
				pelo = v[i][eleccion];
			if (i == 1)
				ojos = v[i][eleccion];
			if (i == 2)
				nariz = v[i][eleccion];
			if (i == 3)
				boca = v[i][eleccion];
			if (i == 4)
				barbilla = v[i][eleccion];
			
		}
		
		System.out.println();
		System.out.println("  " + pelo);
		System.out.println("  " + ojos);
		System.out.println("  " + nariz);
		System.out.println("  " + boca);
		System.out.println("  " + barbilla);
		sc.close();
	}
}