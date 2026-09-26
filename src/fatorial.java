import java.util.Scanner;

public class fatorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        long fatorial = 1;
        int original = n1;

        if (n1 >= 0){
            while (n1 > 1){
                fatorial = fatorial * n1;
                n1--;
            }
            System.out.printf("O fatorial de %d é %d", original, fatorial);
        }else{
            System.out.println("Números negativos não são aceitos");
        }
    }
}
