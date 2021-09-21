package ListadeExercicio01;

import java.util.Scanner;

public class Exe10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a distancia percorrida:");
		double km = scan.nextDouble();
		System.out.println("Digite a quantidade de combustível, em litros:");
		double lt = scan.nextDouble();
		
		double cm = km / lt;
		
		System.out.printf("O consumo médio é %.2f km por litros.", cm);		
		scan.close();
	}

}
