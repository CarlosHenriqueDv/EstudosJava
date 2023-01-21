package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Consumidor;
import br.com.estudojava.devdojomaratonajava.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {

    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Carlos", "123.528");
        Consumidor consumidor2 = new Consumidor("Henrique", "256.14");

        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 2);
        Produto produto2 = new Produto("321", "Samsumg galaxy", 4000.75, 10);
        Produto produto3 = new Produto("879", "Teclado", 1000.00, 0);
        Produto produto4 = new Produto("012", "Rádio velho", 150.00);

        Map<Consumidor, Produto> map = new HashMap<>();

        map.put(consumidor1, produto1);
        map.put(consumidor2,produto3);

        List<Produto> listaProdutosConsumidor1 = new ArrayList<>();
        List<Produto> listaProdutosConsumidor2 = new ArrayList<>();

        listaProdutosConsumidor1.add(produto1);
        listaProdutosConsumidor1.add(produto2);
        listaProdutosConsumidor1.add(produto4);

        listaProdutosConsumidor2.add(produto3);
        listaProdutosConsumidor2.add(produto4);

        /*
        for (Map.Entry<Consumidor, Produto> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
*/
        /**
         * Usar quando o consumidor comprar mais de um produto
         * #O value passa a ser uma lista para uma determinada key
         */

        Map<Consumidor, List<Produto>> mapComListaProdutos = new HashMap<>();
        mapComListaProdutos.put(consumidor1, listaProdutosConsumidor1);
        mapComListaProdutos.put(consumidor2, listaProdutosConsumidor2);

        for (Map.Entry<Consumidor, List<Produto>> entry : mapComListaProdutos.entrySet()){
            System.out.println("Consumidor " + entry.getKey().getNome());
            for (Produto produto : entry.getValue()){
                System.out.println("Produtos comprados: " + produto.getNome());
            }
        }






    }
}
