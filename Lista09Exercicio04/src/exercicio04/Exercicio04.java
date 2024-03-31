package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		int totalQuadros = 64;
        double totalGrãos = 0;
        int quadroAtual = 1;
        double grãosNesteQuadro = 1; // Começando com um grão no primeiro quadro

        do {
            totalGrãos += grãosNesteQuadro; // Adicionando grãos do quadro atual ao total
            System.out.println("Quadro " + quadroAtual + ": " + grãosNesteQuadro + " grãos");

            // Dobrando a quantidade de grãos para o próximo quadro
            grãosNesteQuadro *= 2;
            quadroAtual++;
        } while (quadroAtual <= totalQuadros);

        System.out.println("\nTotal de grãos: " + totalGrãos);
    }
}