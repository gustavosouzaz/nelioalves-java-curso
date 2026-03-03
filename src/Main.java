import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe as coisas para a primiera peça:");
        int codigoPeca = sc.nextInt();
        int numeroPecas = sc.nextInt();
        double valorPecas = sc.nextDouble();
        System.out.println("------------------------------------");

        System.out.println("Informe as coisas para a segunda peça:");
        int codigoPeca2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorPecas2 = sc.nextDouble();

        double resultado  = numeroPecas * valorPecas + numeroPecas2 * valorPecas2;

        System.out.println("VALOR A PAGAR: " + "R$" + resultado);
    }
    }