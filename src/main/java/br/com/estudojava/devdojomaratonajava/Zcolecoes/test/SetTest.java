package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 2);
        Produto produto2 = new Produto("321", "Samsumg galaxy", 4000.75, 10);
        Produto produto3 = new Produto("879", "Teclado", 1000.00, 0);
        Produto produto4 = new Produto("012", "Rádio velho", 150.00);
        Produto produto5 = new Produto("002", "Máquina de lavar", 1500.00, 0);

                                    //LinkedHasSet() mantém a ordem de inserção
        Set<Produto> produtoSet = new LinkedHashSet<>();

        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);

        for (Produto p : produtoSet){

            System.out.println(p);
        }

        System.out.println(produtoSet.size());


    }
}
