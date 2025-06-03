//1. Contagem de 1 a 10 Escreva um programa que exiba os números de 1 a 10, utilizando um laço repita.

package lista09;

public class ExercicioUmLacoRepita01 {

    public static void main(String[] args) {
        int i = 1;

        System.out.println("Contagem de 1 a 10:");

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
