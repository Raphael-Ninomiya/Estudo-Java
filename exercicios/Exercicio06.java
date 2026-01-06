import java.util.Scanner;

//EXERCÍCIO 6 - Arrays e laço for
public class Exercicio06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o nome do aluno(a): ");
        String nome = sc.nextLine();

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do trimestre " + (i + 1) + " (0 a 10): ");
            notas[i] = lerNotaValida(sc);
        }

        double media = calcularMedia(notas);
        String situacao = verificarSituacao(media);

        System.out.println("Nome do aluno: " + nome);
        System.out.printf("Media final: %.2f%n", media);
        System.out.println("Situação: " + situacao);

        sc.close();
    }

    public static double lerNotaValida(Scanner sc) {
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite um valor entre 0 e 10: ");
            nota = sc.nextDouble();
        }

        return nota;
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
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
