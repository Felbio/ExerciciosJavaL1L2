package ListaExercicio02;

import java.util.Scanner;

public class Exe10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double porImp = 0, porDist = 0, valFinal = 0;
		System.out.println("Digite o valor do carro:");
		double valCar = scan.nextDouble();

		if (valCar < 12000) {
			porDist = 0.05;
			valFinal = valCar + (valCar * porImp) + (valCar * porDist);
		} else if (valCar < 25000) {
			porImp = 0.15;
			porDist = 0.10;
			valFinal = valCar + (valCar * porImp) + (valCar * porDist);
		} else {
			porImp = 0.15;
			porDist = 0.20;
			valFinal = valCar + (valCar * porImp) + (valCar * porDist);
		}
		System.out.printf("Valor final do carro: R$ %.2f", valFinal);

		scan.close();
	}

}
