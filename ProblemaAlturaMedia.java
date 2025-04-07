package exercicios;

import java.util.Scanner;

public class ProblemaAlturaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double alt1, alt2, media;
		
		System.out.print("Dados da primeira pessoa: ");
		
		String texto1 = sc.nextLine();
		
		alt1 = sc.nextDouble();
		
		System.out.println("Dados da segunda pessoa: ");
		
		String texto2 = sc.nextLine();
		sc.next();
		alt2 = sc.nextDouble();

		media = (alt1 + alt2) / 2;
		
		
		System.out.print("A altura média de " + texto1 + " e " + texto2 + " é: ");
		System.out.println(String.format("%.2f", media));
		sc.close();
		
	}

}
