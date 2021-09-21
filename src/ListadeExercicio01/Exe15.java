package ListadeExercicio01;

import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double i, p, n, valAcum, lucro;
		// i é a taxa, p é a aplicação mensal e n é o numero de meses
		System.out.println("Rendimento de depósitos fixos numa aplicação financeira");
		System.out.println("Digite o valor constante da aplicação mensal, em R$: ");
		p = scan.nextDouble();
		System.out.println("Digite o valor da taxa, em %: ");
		i = scan.nextDouble();
		System.out.println("Digite o numero de meses, para o calculo do rendimento:");
		n = scan.nextDouble();

		i = i / 100;
		valAcum = (Math.pow(1 + i, n) - 1) * p / i;
		lucro = valAcum - p * n;

		System.out.printf("Rendimento acumulado = R$ %.2f", valAcum);
		System.out.printf("\nLucro = R$ %.2f", lucro);
		
		scan.close();
	}
}
