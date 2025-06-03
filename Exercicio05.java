//5. Contagem de números pares Exiba todos os números pares de 2 a 20 utilizando o laço repita.

package lista09;

public class Exercicio05 {

    public static void main(String[] args) {
        int numero = 2;

        System.out.println("Números pares de 2 a 20:");

        do {
            System.out.println(numero);
            numero += 2;
        } while (numero <= 20);
    }
}
