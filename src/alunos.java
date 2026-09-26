import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class alunos {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        int aprovados = 0;
        int reprovados = 0;
        double soma = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i);
            double nota = scanner.nextDouble();

            notas.add(nota);
            soma += nota;

            if (nota >= 6.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        Collections.sort(notas);

        double menorNota = notas.get(0);
        double maiorNota = notas.get(notas.size() - 1);
        double mediaTurma = soma / notas.size();

        System.out.printf("Quantidade de Aprovados: %d%n", aprovados);
        System.out.printf("Quantidade de Reprovados: %d%n", reprovados);
        System.out.printf("Maior Nota: %.2f%n", maiorNota);
        System.out.printf("Menor Nota: %.2f%n", menorNota);
        System.out.printf("Média Geral da Turma: %.2f%n", mediaTurma);
    }
}