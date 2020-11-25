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
		
	
		
		for (int i = 0; i < v.length;i++) {
			
			if (i == 0)
				System.out.println("Seleccione pelo");
			if (i == 1)
				System.out.println("Seleccione ojos");
			if (i == 2)
				System.out.println("Seleccione nariz");
			if (i == 3)
				System.out.println("Seleccione boca");
			if (i == 4)
				System.out.println("Seleccione barbilla");
			
			for (int j=0;j < v[j].length;j++) {
				
				System.out.println(j + " : " + v[i][j] );
			}
			
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