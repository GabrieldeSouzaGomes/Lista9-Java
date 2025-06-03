//6. Média de notas Peça ao usuário para digitar notas de 0 a 10 e continue pedindo
//até que ele digite um número inválido (menor que 0 ou maior que 10). Depois, calcule a média das notas inseridas.

package lista09;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double soma = 0;
        int quantidade = 0;

        do {
            System.out.print("Digite uma nota entre 0 e 10 (ou um valor inválido para sair): ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidade++;
            }

        } while (nota >= 0 && nota <= 10);

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.printf("A média das notas digitadas é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        scanner.close();
    }
}
