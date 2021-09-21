package ListadeExercicio01;

import java.util.Scanner;

public class Exe21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da prestação:");
		double vPrest = scan.nextDouble();
		System.out.println("Digite a taxa de juros:");
		double tJur = scan.nextDouble();
		System.out.println("Digite a quantidade de dias em atraso:");
		double atraso = scan.nextDouble();

		double vAtual = vPrest + (vPrest * (tJur / 100) * atraso);
		
		System.out.printf("O valor atualizado da fatura é R$ %.2f", vAtual);
		scan.close();
	}
}
