import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int D = N % 2;

        if (D == 0) {
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }



        }
    }