package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {

    public static void main(String[] args) {

        Celular celular1 = new Celular("Galaxy S7", "123456");
        Celular celular2 = new Celular("Iphone 6s", "789654");
        Celular celular3 = new Celular("Sony Xperian", "14568");

        List<Celular> celulares = new ArrayList<>();

        celulares.add(celular1);
        celulares.add(celular2);
        celulares.add(celular3);

        for(Celular celular : celulares){

            System.out.println(celular.getNome());
        }

        Celular celular4 = new Celular("Galaxy S7", "123456");
        System.out.println(celulares.contains(celular4));



    }

}
