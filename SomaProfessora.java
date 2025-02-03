package aulas;

import java.util.Scanner;

public class SomaProfessora {

	public static void main(String[] args) {

		Scanner banana = new Scanner(System.in);
		//Se o Scanner tiver problema, provavelmente é porque não importei
		//Varivel banana para mostrar que qualquer nome é possivel

		int n1, n2, soma; //Desta foma é mais eficiente que um por linha
		
		n1 = banana.nextInt();
		n2 = banana.nextInt();
	
		soma = n1 + n2;
		
		System.out.print("A soma é: " + soma);

	}

}
