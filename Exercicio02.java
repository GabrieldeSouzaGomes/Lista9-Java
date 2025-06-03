//2. Contagem regressiva Peça para o usuário digitar um número e exiba uma contagem regressiva até 0.

package lista09;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        System.out.println("Contagem regressiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}

 