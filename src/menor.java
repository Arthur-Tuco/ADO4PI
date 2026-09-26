import java.util.Scanner;

public class menor {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números na mesma linha (separados por espaço).");
        System.out.println("O ÚLTIMO número deve ser obrigatoriamente 0:");

        String entrada = scanner.nextLine().trim();
        String[] elementos = entrada.split("\\s+");
        String ultimoElemento = elementos[elementos.length - 1];

        if (!ultimoElemento.equals("0")) {
            System.out.println("\nO último número deve ser 0");
            return;
        }

        int menor = Integer.MAX_VALUE;
        int contador = 0;

        for (int i = 0; i < elementos.length; i++) {
            int numero = Integer.parseInt(elementos[i]);

            if (numero < menor) {
                menor = numero;
            }
            contador++;
        }
        if (contador > 0) {
            System.out.printf("\nO menor número digitado foi: %,d", menor);
        } else {
            System.out.println("\nVocê digitou apenas 0");
        }
    }
}
