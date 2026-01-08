import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String x;
        int y;
        double z;
        char w;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        w = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou o número: " + y);
        System.out.println("Você digitou o número decimal: " + z);
        System.out.println("");



        sc.close();

        }
    }