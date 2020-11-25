package dudas;

public class U4Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//localiza el centro de un array, si es par no tendra centro
		
		int [] v = {6,2,3,3,3,4,2,2,3,1,2,3,4,5,6,7,8,9,0,9,8,7,8,9,0,7,4};
					
		Integer c = centro(v);
		
		System.out.println(c != null ? ("El centro esta en la posicion " + c) : "No tiene centro");
	}
	
	//con este metodo localizaremos el centro
	//integer para retornar un entero o null					
	
	public static Integer centro (int [] vector){
		int c = vector.length;

		//descartamos los pares pues un array par no tiene centro
		//si es mayor que 2, por que si es impar pero menor de 2, con 2 numeros no hay centro
		//la c vale vector.length con lo que empiza en uno
		
		if (c % 2 != 0 && c > 2) {		
			
			System.out.println(c);
			c = (c-1) / 2 ; 
			
			System.out.println(c);
			return c;
		}
		
		else 
			
			return null;
		
	}

}