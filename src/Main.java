import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio de um círculo:");

        double v1 = sc.nextDouble();
        double area = 3.14159 * Math.pow(v1,2);

        System.out.println("O resultado do raio desse círculo é: " + area);





        }
    }