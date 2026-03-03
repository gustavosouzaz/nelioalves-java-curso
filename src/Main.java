import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu número de funcionário, horas trabalhadas e salario. SIGA ESSA ORDEM");
       int funcionario = sc.nextInt();
       double horasTrabalhadas = sc.nextDouble();
       double salario = sc.nextDouble();

       double salarioFinal = horasTrabalhadas * salario;

        System.out.println("Número do funcionário: " + funcionario);
        System.out.println("Salário Final: " + "R$" + salarioFinal);








        }
    }