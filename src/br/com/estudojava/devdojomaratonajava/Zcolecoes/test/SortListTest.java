package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Henrique");
        nomes.add("Malvina");
        nomes.add("Teste");
        nomes.add("Moraes");
        nomes.add("Carlos");
        nomes.add(0,"A");

        Collections.sort(nomes);
        List<Double> numeros = new ArrayList<>();
        numeros.add(2d);
        numeros.add(1.9);
        numeros.add(1.6);
        numeros.add(1.5);
        numeros.add(1.8);
        Collections.sort(numeros);

        for (String nome : nomes){
            System.out.print(nome+", ");
        }

        for (Double numero : numeros){
            System.out.print(numero + ", ");
        }


    }
}
