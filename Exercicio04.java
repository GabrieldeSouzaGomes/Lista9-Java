//4. Tabuada de um número Peça para o usuário digitar um número e exiba sua tabuada de 1 a 10 utilizando um laço repita.

package lista09;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        int i = 1;

        System.out.println("Tabuada do " + numero + ":");

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        scanner.close();
    }
}
