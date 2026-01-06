import java.util.Scanner;

//EXERCÍCIO 0 Primeira introdução ao Sout e If else no java
public class Exercicio00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if(idade >=18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}
