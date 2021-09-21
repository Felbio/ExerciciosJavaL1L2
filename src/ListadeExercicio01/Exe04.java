package ListadeExercicio01;

import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double l1, l2, l3, t, area;
		System.out.println("Digite os lados do triângulo: ");
		l1 = scan.nextDouble();
		l2 = scan.nextDouble();
		l3 = scan.nextDouble();
		t = (l1 + l2 + l3) / 2;
		area = Math.sqrt(t * (t - l1)*(t - l2)*(t - l3));
		System.out.printf("A área do triângulo é: %.2f",area);
		scan.close();
		}

}
