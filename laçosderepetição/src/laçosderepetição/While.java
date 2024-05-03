package laçosderepetição;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scanner = new Scanner(System.in);
		int idade = 0, maior_50 = 0, menor_21 = 0;
		


		while(idade >= 0) {
			System.out.println("digite a idade:");
			idade = scanner.nextInt();
			if(idade > 50) {
				maior_50++;
			}
			if(idade < 21 ) {
				menor_21 ++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos:" + menor_21);
		System.out.println("Total de pessoas maiores de 50 anos:" + maior_50);

	}



	}


