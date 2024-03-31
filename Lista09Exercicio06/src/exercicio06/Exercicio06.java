package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        double soma = 0;
        int totalValores = 0;
        double media = 0;
        
        double valor;
        
        do {
            System.out.print("Digite um número (ou um número negativo para sair): ");
            valor = scanner.nextDouble();
            
            if (valor >= 0) {
                soma += valor;
                totalValores++;
            }
        } while (valor >= 0);
        
        if (totalValores > 0) {
            media = soma / totalValores;
            System.out.println("Total do somatório: " + soma);
            System.out.println("Média aritmética: " + media);
            System.out.println("Total de valores lidos: " + totalValores);
        } else {
            System.out.println("Nenhum valor válido foi fornecido.");
        }
        
        scanner.close();
    }
}