import java.util.Scanner;

//EXERCÍCIO 5 - While e validação de entrada
public class Exercicio05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a nota do aluno (0 a 10): ");

        double notaFinal = lerNotaValida(sc);

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota final: " + notaFinal);

        sc.close();
    }

    public static double lerNotaValida(Scanner sc) {
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite novamente: ");
            nota = sc.nextDouble();
        }

        return nota;
    }
}
