package dudas;

import java.util.Scanner;

public class OrdenarDosTablasEnUnaTercera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer 2 series de 10 y fusionarlas en otra manteniendo el orden creciente
		
		Scanner sc = new Scanner(System.in);
		
		int a[], b[], c[];
		
		a = new int[10];
		b = new int[10];
		c = new int[20];
		
		boolean crecienteA=true;
		boolean crecienteB=true;
		
		
		for (int i=0;i<a.length;i++) {
			
			if (i==0){				
				
				System.out.println("introduce el primer numero de la primera tabla");
				
				a[i]=sc.nextInt();
			}
			
			else if (i > 0) {
			
				do {
					
					System.out.println("introduce un numero para rellenar la primera tabla");
					a[i]=sc.nextInt();
				
					if(a[i-1]>=a[i]) {					
						
						System.out.println("Debes introducir un numero mayor que el anterior");
						crecienteA=false;									
					}
					else
						crecienteA=true;
			
				}while(!crecienteA);
			
			}
		}
		
		for (int i=0;i<b.length;i++) {
			
				if (i==0){				
				
				System.out.println("introduce el primer numero de la segunda tabla");
				
				b[i]=sc.nextInt();
				
				}
				
				else if (i > 0) {
			
					do {
						
						System.out.println("introduce un numero para rellenar la segunda tabla");
						b[i]=sc.nextInt();
					
						if(b[i-1]>=b[i]) {					
							
							System.out.println("Debes introducir un numero mayor que el anterior");
							crecienteB=false;									
						}
						else
							crecienteB=true;
				
					}while(!crecienteB);
			
				}

		}
		
		for (int k=0;k<a.length;k++) {		//mostramos los dos bucles
			
			System.out.printf("a: %d    b:%d\n",a[k],b[k]);
		}
		
		
		//rellenamos el array completo
		
		for (int x= 0; x < c.length;x++) {
			
			if (x <= 9) {
				
				c[x] = a [x];
			}
			
			else
				
				c[x] = b[x-10];
			
		}
		
		//ahora lo ordenamos
		
		int l = c.length;
		
		//recorremos el total del array
		
		for (int i = 0; i < l; i++){
			
			//recorremos comprobando todos los valores y reasignando los numeros 
			//en cada iteracion coloca un numero, -i porque sera un numero menos a coloca y recorrera solo lo necesario, bloques
			
			for (int j = 0; j < l -1 -i; j++){

				if ( c[j] > c[j + 1]) {

					int aux = c[j];
					c[j] = c[j+1];
					c[j+1] = aux;
				
				}

			}

		}
		
		//mostramos el resultado final
		
		for (int x=0;x<c.length;x++) {  
			
			System.out.printf("c%d: %d\n",x, c[x]);
		}
		
		sc.close();
	}
}
