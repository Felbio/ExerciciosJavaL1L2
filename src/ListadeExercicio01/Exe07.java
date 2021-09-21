package ListadeExercicio01;

import java.util.Scanner;

public class Exe07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		double r, s, d;
		System.out.println("Digite os valores de A, B e C:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		
		System.out.printf("O resultado da sentença é %.2f", d);		
		scan.close();
	}

}
