package ListadeExercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double taxa_dia, taxa_km_rodado, desconto, km_rodado, tot_aluguel;
		int dias;

		System.out.println("Aluguel de carros...");
		System.out.println("Digite o valor da taxa fixa diária do carro, em R$:");
		taxa_dia = scan.nextDouble();
		System.out.println("Digite o valor da taxa de km rodado, em R$:");
		taxa_km_rodado = scan.nextDouble();
		System.out.println("Digite o numero de dias de aluguel do carro:");
		dias = scan.nextInt();
		System.out.println("Digite o numero de km rodados pelo carro:");
		km_rodado = scan.nextDouble();
		
		desconto = 1.10 * taxa_dia;
		tot_aluguel = dias * (taxa_dia - desconto) + taxa_km_rodado * km_rodado;
		
		System.out.printf("Valor do desconto nas diárias, por dia: R$ %.2f", desconto);
		System.out.println("\nO carro foi alugado por " + dias + " dias.");
		System.out.println("O carro rodou " + km_rodado + " Quilometros.");
		System.out.printf("Valor do Aluguel: R$ %.2f", tot_aluguel);
		scan.close();

	}

}
