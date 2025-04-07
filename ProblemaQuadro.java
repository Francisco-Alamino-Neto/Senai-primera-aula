package exercicios;

import java.util.Scanner;

public class ProblemaQuadro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double larg, alt, area, perimetro, diag2, diagFinal;
		
		System.out.print("Digite a largura do quadro: ");
		larg = sc.nextDouble();
		
		System.out.print("Digite a altura do quadro: ");
		alt = sc.nextDouble();
		
		area = larg * alt;
		
		perimetro = larg * 2 + alt * 2;
		
		diag2 = (larg * larg) + (alt * alt);
		
		diagFinal = Math.sqrt(diag2);
		
		System.out.print("A área é: ");
		System.out.println(String.format("%.4f", area));
		
		System.out.print("O perímetro é: ");
		System.out.println(String.format("%.4f", perimetro));
		
		System.out.print("A diagonal é: ");
		System.out.println(String.format("%.4f", diagFinal));
		sc.close();
		
	}

}
