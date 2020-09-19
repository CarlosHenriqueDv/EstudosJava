package br.com.estudojava.devdojomaratonajava.ZZAGenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {


        List<String> lista = new ArrayList<>();

        lista.add("234234");
        lista.add("sdfda");

        for (String obj : lista){
            System.out.println(obj);
        }
        add(lista, 1L);


    }

    //cuidado
    public static void add(List lista, Long l){
        lista.add(1);

    }
}
