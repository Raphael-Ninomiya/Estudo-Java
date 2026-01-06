import java.util.Scanner;
import java.time.Year;

//EXERCÍCIO 3 - Métodos, parâmetros e retorno
public class Exercicio03 {
    public static void main (String[] args) { 
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu ano de nascimento: "); 
        int ano = sc.nextInt();

        int idade = calcularIdade(ano);
        String classificacao = classificarIdade(idade);

        System.out.println("Seu nome é: " + nome);
        System.out.println("Você tem " + idade + " anos de idade.");
        System.out.println("Você é classificado como " + classificacao + ".");

        sc.close();
    }

    public static int calcularIdade (int anoNascimento) {
        int anoAtual = Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    public static String classificarIdade(int idade) {
        if (idade >= 60) {
            return "idoso(a).";
        } else if (idade >= 18) {
            return "maior de idade.";
        } else {
            return "menor de idade.";
        }
    }
}
