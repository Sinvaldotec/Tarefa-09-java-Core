package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int contador = 1;
	        long somatorioFatorial = 0;

	        do {
	            System.out.print("Digite o " + contador + "º valor inteiro: ");
	            int valor = scanner.nextInt();
	            long fatorial = calcularFatorial(valor);
	            somatorioFatorial += fatorial;
	            contador++;
	        } while (contador <= 15);

	        System.out.println("O somatório das factoriais é: " + somatorioFatorial);
	    }

	    public static long calcularFatorial(int n) {
	        long fatorial = 1;
	        for (int i = 1; i <= n; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }
	}