//10. Senha correta Peça para o usuário digitar uma senha e continue pedindo até que ele insira a senha correta.

package lista09;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SENHA_CORRETA = "1234";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(SENHA_CORRETA)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!senhaDigitada.equals(SENHA_CORRETA));

        System.out.println("Acesso permitido!");

        scanner.close();
    }
}
