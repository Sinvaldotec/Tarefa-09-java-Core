package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		// Inicializa o contador
        int contador = 1;
        
        // Executa o loop do-while
        do {
            // Verifica se o número é divisível por 4
            if (contador % 4 == 0) {
                // Se for divisível, exibe o número
                System.out.println(contador);
            }
            
            // Incrementa o contador
            contador++;
        } while (contador < 200);
    }
}
