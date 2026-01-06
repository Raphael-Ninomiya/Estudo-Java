import java.util.Scanner;
import java.time.Year;

//EXERCÍCIO 2 - Cálculo de salário (Usando double) com regras condicionais
public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeFuncionario = sc.nextLine();

        System.out.println("Qual o seu salário atual: ");
        double salario = sc.nextDouble();

        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Salario antigo: " + salario);

        double percentual;

        if(salario < 2000){
            percentual = 0.15;
        } else if (salario >=2000 && salario <= 5000) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }

        double aumento = salario * percentual;
        double salarioNovo = salario + aumento;

        System.out.println("Seu salario aumentou " + aumento + " reais e agora você receberá: " + salarioNovo);

        sc.close();
    }
}
