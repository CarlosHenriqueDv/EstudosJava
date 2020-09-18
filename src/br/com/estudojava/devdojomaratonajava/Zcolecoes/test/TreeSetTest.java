package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Celular;
import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Produto;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 2);
        Produto produto2 = new Produto("321", "Samsumg galaxy", 4000.75, 10);
        Produto produto3 = new Produto("879", "Teclado", 1000.00, 0);
        Produto produto4 = new Produto("012", "Rádio velho", 150.00);


        /**
         *
         O elemento que é adicionado a um NavigableSet/TreeSet precisa obrigatoriamente
         ter um método comparable ou pode ser passado um comparable no construtor do TreeSet
         */
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();

        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);


        //.descendingSet() tras a lista em uma ordem inversa
        for (Produto produto : produtoNavigableSet.descendingSet()){
            System.out.println(produto);
        }

        System.out.println("----------------------------");
        //lower <
        //floor <=
        //higher >
        //ceiling >=

        //pollFirst() retorna o primeiro objeto e remove o mesmo
        //pollLast() retorna o ultimo objeto e remove o mesmo

        System.out.println(produtoNavigableSet.pollLast());


        //retorna o produto menor antes do produto passado
        System.out.println(produtoNavigableSet.floor(produto2));



    }


}
