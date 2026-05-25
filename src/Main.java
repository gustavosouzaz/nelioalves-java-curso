import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int S = A / B;

        if(A % B == 0 || B % A == 0) {
            System.out.println("São Multíplos");
        }else {
            System.out.println("Não são Multíplos");
        }
        sc.close();

        }
    }