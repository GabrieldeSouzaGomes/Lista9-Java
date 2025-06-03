//9. Fatorial de um número Peça ao usuário para digitar um número e calcule seu fatorial usando um laço repita.

package lista09;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        int i = numero;

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de número negativo.");
        } else {
            do {
                fatorial *= i;
                i--;
            } while (i > 0);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
