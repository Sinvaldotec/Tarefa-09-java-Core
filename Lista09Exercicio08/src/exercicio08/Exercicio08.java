package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double areaTotal = 0;

        String resposta;
        do {
            System.out.println("Digite o nome do cômodo:");
            String nomeComodo = scanner.nextLine();

            System.out.println("Digite a largura do cômodo em metros:");
            double largura = scanner.nextDouble();

            System.out.println("Digite o comprimento do cômodo em metros:");
            double comprimento = scanner.nextDouble();

            // Calcula a área do cômodo
            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("A área do " + nomeComodo + " é: " + areaComodo + " metros quadrados.");

            scanner.nextLine(); // Limpa o buffer do scanner

            System.out.println("Deseja adicionar outro cômodo? (Digite 'SIM' para continuar ou 'NAO' para sair)");
            resposta = scanner.nextLine().toUpperCase();

        } while (!resposta.equals("NAO"));

        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");

        scanner.close();
    }
}
