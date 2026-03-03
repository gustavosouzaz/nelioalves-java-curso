import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;

        System.out.println("Triangulo: " + ((a * c) / 2));
        System.out.println("Circulo: " + (pi * Math.pow(c,2)));
        System.out.println("Trapezio: " + ((a + b) * c / 2));
        System.out.println("Quadrado: " + (b * b));
        System.out.println("Retangulo: " + (a * b));

    }
    }