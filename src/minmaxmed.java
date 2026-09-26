import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class minmaxmed {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double soma = 0;
        int contador = 0;

        List<Integer> listaNumeros = new ArrayList<>();
        System.out.println("Digite números inteiros (digite 0 para parar):");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            listaNumeros.add(numero);

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

            soma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = soma / contador;

            Collections.sort(listaNumeros);

            double mediana;

            if (contador % 2 != 0) {
                int meio = contador / 2;
                mediana = listaNumeros.get(meio);
            } else {
                int meio2 = contador / 2;
                int meio3 = meio2 -1;
                mediana = (listaNumeros.get(meio3) + listaNumeros.get(meio2)) / 2.0;
            }
            System.out.printf("Maior número: %,d%n", maior);
            System.out.printf("Menor número: %,d%n", menor);
            System.out.printf("Média aritmética: %.2f%n", media);
            System.out.printf("Mediana: %.2fn", mediana);
        } else {
            System.out.println("\nNenhum número válido foi digitado.");
        }

    }
}
