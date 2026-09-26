import java.util.Scanner;

public class maior {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números na mesma linha (separados por espaço).");
        System.out.println("O ÚLTIMO número deve ser obrigatoriamente 0:");

        String entrada = scanner.nextLine().trim();
        String[] elementos = entrada.split("\\s+");
        String ultimoElemento = elementos[elementos.length - 1];

        if (!ultimoElemento.equals("0")) {
            System.out.println("\nO último número digitado DEVE ser 0.");
            return;
        }

        int maior = Integer.MIN_VALUE;
        int contador = 0;

        for (int i = 0; i < elementos.length - 1; i++) {
            int numero = Integer.parseInt(elementos[i]);

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        if (contador > 0) {
            System.out.printf("\nO maior número digitado foi: %,d", maior);
        } else {
            System.out.println("\nVocê digitou apenas 0.");
        }
    }
}