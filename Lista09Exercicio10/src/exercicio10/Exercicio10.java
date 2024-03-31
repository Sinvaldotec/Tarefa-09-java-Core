package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dividendo:");
        int dividendo = scanner.nextInt();

        System.out.println("Digite o divisor:");
        int divisor = scanner.nextInt();

        int quociente = 0;
        int resto = dividendo;

        do {
            resto -= divisor;
            if (resto >= 0) {
                quociente++;
            }
        } while (resto >= divisor);

        System.out.println("O resultado inteiro da divisão é: " + quociente);

        scanner.close();
    }
}