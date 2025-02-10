package exercicios;

import java.util.Scanner;

public class ProblemaPiso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double larg, comp, valorM2, area, total;
		
		System.out.print("Digite a largura do cômodo: ");
		larg = sc.nextDouble();
		
		System.out.print("Digite o comprimento do cômodo: ");
		comp = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		valorM2 = sc.nextDouble();
		
		area = larg * comp;
		
		total = area * valorM2;
		
		System.out.print("A área é: ");
		System.out.println(String.format("%.2f", area));
		
		System.out.print("O custo total do piso é: ");
		System.out.println(String.format("%.2f", total));
		sc.close();
		
	}

}

//Algoritmo: largura é:; comprimento é:; valor do metro quadrado:; area do comodo:; total:;