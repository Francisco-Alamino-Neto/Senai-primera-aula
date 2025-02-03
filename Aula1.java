package aulas;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        double x, y, media;
        
        System.out.print("Digite o primeiro numero: ");
        x = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        y = sc.nextDouble();
        media = (x + y) / 2.0;
        System.out.println("Media = " + media);
        sc.close();
	}

}
