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
		//boolean crecienteC=false;

		for (int i=0;i<a.length;i++) {
			
			if (i==0){				//la primera vez se introduce normal rellenamos tablas
				
			System.out.println("introduce un numero para rellenar la primera tabla");
			
			a[i]=sc.nextInt();
			
			System.out.println("introduce un numero para rellenar la segunda tabla");
			
			b[i]=sc.nextInt();
		
			}
			else if(i > 0) {		//a partir de la segunda comparamos con la primera
			
				do {
					System.out.println("introduce un numero para rellenar la primera tabla");
					a[i]=sc.nextInt();
				
					if(a[i-1]>=a[i]) {					//con esto aseguramos que el numero introducido sea mayor que el anterior
						
						System.out.println("Debes introducir un numero mayor que el anterior");
						crecienteA=false;									//si no lo es avisamos
					}
					else
						crecienteA=true;
			
				}while(!crecienteA);
			
				do{										//aqui lo mismo para el rellenar el segundo array
				
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
	
		for (int j=0;j<c.length/2;j++) {	//rellenamos la 1ra parte del bucle c que seran las 2 bucles juntos, como ya viene ordeanado simplemente asignamos los valores de a a las 10 primeras posiciones de c
				
				c[j]=a[j];
				System.out.println("c" + j +": " +c[j] );
							
			}
		for (int l=0;l<b.length;l++) { 			//*********************** recorre el array b
			
			for (int m=0;m<c.length;m++) {		//recorre el array c
				
				
				if (b[l]<=c[m]) {				//comprueba si el valor de b[l] es menor que alguno de los valores de c[]
					
					for (int t = c.length-1; t > m; t--) {		//mueve una posicion el array dejando un valor "libre", duplicado para eliminarlo
						
						c[t+1] = c[t];
					}
					
					c[m] = b[l];				//una vez ha movido lo necesario introduce en la posicion de c[] el valor de b[]		
					
				}
				
				else
					
					c[m] = b[l];			//si no hay ningun valor en c[] menor que b[l] lo introduce al final de c 

			}
			
		}									//******************************
		
		for (int x=0;x<c.length;x++) {  //mostramos el resultado final
			
			System.out.printf("c%d: %d\n",x, c[x]);
		}
		
		sc.close();
	}



}
