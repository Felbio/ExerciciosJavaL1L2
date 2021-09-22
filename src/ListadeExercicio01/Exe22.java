package ListadeExercicio01;

import java.util.Scanner;

public class Exe22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*String s = "171";
		s += 17;
		System.out.println(s);
		double x, y;
		System.out.println("Digite um numero:");
		y = scan.nextDouble();
		
		if(y > 4 || y < -4) {
			y = (3 * y + 3) / Math.sqrt(Math.pow(y, 2)-16);
		}
		System.out.println(y);
		
		int x;
		System.out.println("Digite um numero inteiro:");
		x = scan.nextInt();
		if (x % 10 == 0) {System.out.println("Iron Maiden");}
		else if(x % 2 == 0) {System.out.println("rush");}
		else if(x % 5 == 0) {System.out.println("black saba");}
		else {System.out.println("i wanna rock");
		}
		
		int x, y, z, malvado;
		
		System.out.println("Digit  1");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		if (x>y) {
			if(x > z) {malvado = x;
			}else 
			{ malvado = z;}				
			} else {
				if(y > z) {malvado =y;
						}else {malvado = z;}
		}
		
		System.out.println(malvado);
		System.out.println(malvado);
		System.out.println(malvado);
		
		
		int x, y, z;
		String resposta;
		x = scan.nextInt();
		y = scan.nextInt();
		
		z = (x + y) * 5;
		
		if(z <= 0) {resposta = "A";}
		else if(z <= 100) {resposta = "B";}
		else {resposta = "C";}
		System.out.println(z + " - " + resposta);*/
		
		double h, b;
		h = 3;
		b = 3;
		
		double z = (b * h) / 2;
		double t = (b + 1 * h) / 2;
		double y = b + 1 * h / 2;
		double l = (b + 1) * h / 2;
		double j = ++b * h / 2;
		double k = b++ * h / 2;
		
		System.out.println(z);
		System.out.println(t);
		System.out.println(y);
		System.out.println(l);
		System.out.println(j);
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
