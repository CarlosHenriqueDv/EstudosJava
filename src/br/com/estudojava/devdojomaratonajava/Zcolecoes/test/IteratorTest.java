package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<Produto> produtoList = new ArrayList<>();

        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 2);
        Produto produto2 = new Produto("321", "Samsumg galaxy", 4000.75, 10);
        Produto produto3 = new Produto("879", "Teclado", 1000.00, 0);
        Produto produto4 = new Produto("012", "Rádio velho", 150.00);

        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);

        Iterator<Produto> produtoIterator = produtoList.iterator();

        //hasNext(); verifica se existe um próximo elemento na lista
        //next(); pega um elemento da lista;

        while (produtoIterator.hasNext()){
            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }

        }


        System.out.println(produtoList.size());



    }
}
