package estruturaCondicional;

import java.util.Scanner;

public class NotaSe {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		System.out.println("imforme a primeira nota ");
		nota1 = ler.nextInt( );

		System.out.println("imforme a segunda nota ");
		nota2 = ler.nextInt( );

		System.out.println("imforme a terceira nota ");
		nota3 = ler.nextInt( );

		System.out.println("imforme a quarta nota ");
		nota4 = ler.nextInt( );

		media = (nota1 + nota2 + nota3 + nota4)/4  ; 

		System.out.println("sua média esta: ");


		if(media  >= 7) {
			System.out.println("Aprovado" + media );

		}
		else {
			System.out.println("reprovado" + media);

		}


		ler.close();

	}

}

