package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Malvina");

        nomes2.add("Carlos2");
        nomes2.add("Malvina2");
        //Limpa todos os elementos da lista
        nomes.clear();
        nomes.addAll(nomes2);
        System.out.println(nomes.remove("carlos"));


        for (String nome: nomes ) {
            System.out.println(nome);
        }



        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for (Integer num : numeros){
            System.out.println(num);
        }
    }
}
