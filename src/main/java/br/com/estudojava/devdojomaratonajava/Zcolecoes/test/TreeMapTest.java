package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        //a classe que vai na chave precisa implementar comparable se não tiver dá erro em tempo de execução
        map.put("F", "Letra F");
        map.put("A", "Letra A");
        map.put("C", "Letra C");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "" + entry.getValue());
        }

        System.out.println(map.headMap("C",true));




    }
}
