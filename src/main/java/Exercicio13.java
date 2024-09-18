import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        {
            //declarar variáveis
            float salario, prestacao;
            
            //ler variáveis
            System.out.println("Digite o valor do salário bruto: ");
            salario = leitor.nextFloat();
            System.out.println("Digite o valor da prestação: ");
            prestacao = leitor.nextFloat();
            
            //verificar condições e mostrar resultado no console
            if(prestacao>salario*0.3){
                System.out.println("O empréstimo negado!");
            }else{
                System.out.println("O empréstimo concedido!");
            }
        }
    }
}