//9. Fatorial de um número Peça ao usuário para digitar um número e calcule seu fatorial usando um laço repita.

package lista09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;
            int i = numero;

            do {
                fatorial *= i;
                i--;
            } while (i > 0);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
