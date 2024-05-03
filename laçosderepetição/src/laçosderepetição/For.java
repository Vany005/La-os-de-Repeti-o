package laçosderepetição;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
		//mostre na tela quantos números são pares e quantos número são ímpares
		Scanner scanner = new Scanner(System.in);
        
		int numerosPares = 0, numerosImpares = 0, contador = 1;
        

        for (contador = 1; contador <= 10; contador++) {
            System.out.println("\nDigite o "+ contador +"º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
    }


	}


