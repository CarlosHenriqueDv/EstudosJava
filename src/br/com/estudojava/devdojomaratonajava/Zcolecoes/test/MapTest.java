package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        //Não pode existir chaves duplicadas
        //Se for inserida uma chave duplicada o valor é substituido
        //LinkedHashMap conserva a ordem de inserção
        Map<String, String> map = new LinkedHashMap<>();

        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("meza", "mesa");

        for (String key : map.values()){

            System.out.println(key);
        }

        System.out.println("--------------");

        //codigo se quiser pegar a chave e o valor chamar Map.Entry<String, String>
        // e passar no diamante o tipo da chave e do valor. Nesse caso <String, String>

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }




    }
}
