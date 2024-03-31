package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		// Inicializa a variável de controle do laço
        int numero = 15;
        
        // Laço do-while para calcular e exibir os quadrados
        do {
            int quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
            
            // Incrementa o número para a próxima iteração
            numero++;
        } while (numero <= 200);
    }
}