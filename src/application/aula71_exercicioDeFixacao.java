//uDemy, curso Java Completo, secao 13, aula 71 - exercicio de fixacao
package application;

import java.util.Locale;
import java.util.Scanner;
import util.DollarCost;

public class aula71_exercicioDeFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice, dollarsQuantity;
		
		System.out.print("What is the dollar price?");
		dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought?");
		dollarsQuantity = sc.nextDouble();
	
		System.out.printf("Amount to be paid in Reais = %.2f", DollarCost.costCalc(dollarPrice, dollarsQuantity));	
		
		sc.close();
	}
}
