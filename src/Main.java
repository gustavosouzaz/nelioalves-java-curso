import entidades.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Trabalhador> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Trabalhador emp = new Trabalhador(id,salary,name);

            list.add(emp);



        }

    }
}
