package aulas;

import java.util.Scanner;

public class PrimeiraAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		String texto = sc.next();
		
		int numero;
		
		numero = sc.nextInt();
		
		System.out.print(texto +" "+ numero);
		sc.close();

	}

}
