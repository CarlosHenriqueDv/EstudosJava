package br.com.estudojava.desafiouri.iniciante;


import java.util.*;

public class URI1042SortSimples {

    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();

        List<Integer> listaOriginal = new ArrayList<>();

        listaOriginal.add(numero1);
        listaOriginal.add(numero2);
        listaOriginal.add(numero3);

        List<Integer> listaOrdenada = new ArrayList<>(listaOriginal);

        Collections.sort(listaOrdenada);
        //listaOrdenada.forEach(System.out::println);
        System.out.println("");
        //listaOriginal.forEach(System.out::println);




    }
}

