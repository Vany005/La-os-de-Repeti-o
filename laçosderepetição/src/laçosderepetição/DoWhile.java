package laçosderepetição;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero, positivo = 0;
		
		
		do {
		System.out.print("Digite:");
		numero = scanner.nextInt();
		if(numero > 0) {
			positivo = positivo + numero;
		}
		
		
		}while(numero != 0);

		
		System.out.print("A soma dos números positivos é: " + positivo);
		
	}



	}


