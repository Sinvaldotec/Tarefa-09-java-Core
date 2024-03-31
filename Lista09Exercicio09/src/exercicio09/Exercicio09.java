package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite valores inteiros positivos (digite um valor negativo para parar):");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (numero >= 0);

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum número positivo foi inserido.");
        }

        scanner.close();
    }
}
