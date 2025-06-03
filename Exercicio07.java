//. Adivinhe o número O programa escolhe um número secreto entre 1 e 10. 
//O usuário deve tentar adivinhar o número. O programa deve continuar pedindo até que o usuário acerte.

package lista09;

import java.util.Scanner;
import java.util.Random;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1; // número entre 1 e 10
        int palpite;

        System.out.println("Tente adivinhar o número secreto entre 1 e 10.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite != numeroSecreto) {
                System.out.println("Errado! Tente novamente.");
            }

        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);

        scanner.close();
    }
}
