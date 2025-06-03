//3. Soma de números positivos Peça ao usuário para digitar números positivos e some-os. 
//O programa deve continuar pedindo números até que o usuário digite um número negativo, então ele deve exibir o total somado.

package lista09;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número positivo (ou negativo para encerrar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }

        } while (numero >= 0);

        System.out.println("A soma dos números positivos digitados é: " + soma);

        scanner.close();
    }
}
