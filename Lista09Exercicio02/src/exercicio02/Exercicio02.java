package exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		  int numero = 1;
	        int somatorioPares = 0;

	        do {
	            if (numero % 2 == 0) { // Verifica se o número é par
	                somatorioPares += numero; // Adiciona o número ao somatório
	            }
	            numero++;
	        } while (numero <= 500);

	        System.out.println("O somatório dos valores pares de 1 até 500 é: " + somatorioPares);
	    }
	}
