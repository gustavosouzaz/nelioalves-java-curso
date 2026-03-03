import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 4 valores e descubra a diferença de algum  deles:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int r = a * b - c * d;

        System.out.println("A diferencia dos produtos é: " + r);






        }
    }