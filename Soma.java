package aulas;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;

		int n1;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		
		int n2;
		
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		int resultado;
		
		resultado = (n1) + (n2); // * multiplacação, / divisão
		//Não é necessário colocar entre parentêses
		
		System.out.print("O resultado é: " + resultado); //Não esqueça de colocar + quando necessário
		sc.close(); //Não é obrigatório, mas quando presente, o programa processa menos, ficando mais leve.

	}

}
