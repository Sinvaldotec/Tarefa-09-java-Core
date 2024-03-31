package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		int numero = 1;
        
        do {
            if (numero % 2 != 0) {
                System.out.println("Fatorial de " + numero + ": " + calcularFatorial(numero));
            }
            numero++;
        } while (numero <= 10);
    }
    
    public static int calcularFatorial(int num) {
        int fatorial = 1;
        
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        return fatorial;
    }
}
