package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Celular;

public class EqualsTest {
    public static void main(String[] args) {

        Celular c1 = new Celular("Iphone", "1234");
        Celular c2 = new Celular("Iphone", "1234");

        System.out.println(c1.equals(c2));


    }
}
