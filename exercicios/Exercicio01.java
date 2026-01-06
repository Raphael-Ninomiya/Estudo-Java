import java.util.Scanner;
import java.time.Year;

//EXERCÍCIO 1 - Entrada de dados (Scanner) e estruturas condicionais (If e else)

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = Year.now().getValue();

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int ano = sc.nextInt();

        if(ano > anoAtual || ano < 1900){
            System.out.println("Ano de nascimento inválido.");
            sc.close();
            return;
        }

        int idade = anoAtual - ano;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (idade >= 60) {
            System.out.println("Idoso(a)");
        } else if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}
