package ListadeExercicio01;

import java.util.Scanner;

public class Exe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double raio, comp, vol, area;
		System.out.println("Digite o valor do raio");
		raio = scan.nextDouble();

		comp = 2 * Math.PI * raio;
		area = Math.PI * Math.pow(raio, 2);
		vol = (4 / 3) * Math.PI * Math.pow(raio, 3);

		System.out.printf("\n\n Comprimento da circunferencia: %.1f", comp);
		System.out.printf("\n\n Área da circunferencia: %.3f", area);
		System.out.printf("\n\n Volume da esfera: %.2f", vol);
		scan.close();
	}

}
