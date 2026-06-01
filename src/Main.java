import entidades.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Cosa");
        list.add("Maria");
        list.add("Caio");
        list.add("Luan");
        list.add(2, "Marco");

        System.out.println(list.size());



        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'C');
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
        for(String x : list) {
            System.out.println(x);
        }
    }
}
