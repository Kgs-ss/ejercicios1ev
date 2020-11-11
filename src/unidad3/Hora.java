package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int h;
		int m;
		int s;
		int dias=0;
		
		System.out.println("dime la hora");
		h = sc.nextInt();
		System.out.println("dime los minutos");
		m = sc.nextInt();
		System.out.println("dime los segundos");
		s = sc.nextInt();
		
		s++;
		
		while (s >= 60) {
			
			s = s - 60;
			m++;
		}
		while(m >= 60) {
			
			m = m - 60;
			h++;
			
		}
		while (h >= 24) {
			
			h = h -24;
			dias++;
		}
		
		System.out.printf("Han pasado %d dia/s y dentro de un segundo la hora sera %02d : %02d : %02d del dia %d ",dias, h, m, s, (dias+1));

		sc.close();
	}

}
