void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número (inteiro): ");
    int n1 = scanner.nextInt();

    int divisores = 0;

    for (int i = 1; i <= n1; i++) {
        if (n1 % i == 0){
            divisores++;
        }
    }
    if (divisores == 2){
        System.out.printf("O número %d é primo!", n1);
    }else {
        System.out.printf("O número %d não é primo!", n1);
    }
    }

