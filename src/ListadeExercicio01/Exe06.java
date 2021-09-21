package ListadeExercicio01;

import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do cilindro em metros:");
		double raio = scan.nextDouble();
		System.out.println("Digite a altura do cilindro em metros:");
		double alt = scan.nextDouble();
		
		double area = Math.pow(Math.PI,2) * raio * (alt + raio);
		double vol = Math.PI * Math.pow(raio,2) * alt;
		
		System.out.printf("\n�rea � igual a %.2f", area);
		System.out.printf("\nVolume � igual %.2f", vol);		
		scan.close();
	}

}
