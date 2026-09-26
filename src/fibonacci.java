import java.util.Scanner;

public class fibonacci {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Até quando você quer ir (número)?: ");
        int fim = scanner.nextInt();
        int primeiro = 0, segundo = 1;

        for (int i = 0; i < fim; i++){
            System.out.print(primeiro + " ");
            int prox = primeiro + segundo;
            primeiro = segundo;
            segundo = prox;
        }
    }
}
