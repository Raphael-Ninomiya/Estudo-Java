import java.util.Scanner;

//EXERCÍCIO 7 — Sistema simples de alunos
public class Exercicio07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos alunos serão cadastrados ?");
        int quantidadeAlunos = sc.nextInt();

        sc.nextLine(); // limpa o buffer

        String[] nomes = new String[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno:");
            nomes[i] = sc.nextLine();

            double[] notas = new double[3];

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a nota do trimestre " + (j + 1) + " (0 a 10):");
                notas[j] = validarNotas(sc);
            }

            sc.nextLine();

            double media = calcularMedia(notas);
            String situacao = verificarSituacao(media);

            System.out.println("Aluno: " + nomes[i]);
            System.out.printf("Média final: %.2f%n", media);
            System.out.println("Situação: " + situacao);

        }

        sc.close();
    }

    public static double validarNotas (Scanner sc) {
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10){
            System.out.println("Nota inválida. Digite novamente a nota (0 a 10): ");
            nota = sc.nextDouble();
        }

        return nota;
    }

    public static double calcularMedia (double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
