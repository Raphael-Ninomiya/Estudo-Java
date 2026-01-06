import java.util.Scanner;

//EXERCÍCIO 4 - Métodos com múltiplos parâmetros e reutilização
public class Exercicio04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Nota do primeiro semestre: ");
        double n1 = sc.nextDouble();

        System.out.println("Nota do segundo semestre: ");
        double n2 = sc.nextDouble();

        double media = calcularMedia(n1, n2);
        String situacao = verificarSituacao(media);

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Nota final: %.2f%n" + media);
        System.out.println("Situação: " + situacao);

        sc.close();
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static String verificarSituacao (double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
