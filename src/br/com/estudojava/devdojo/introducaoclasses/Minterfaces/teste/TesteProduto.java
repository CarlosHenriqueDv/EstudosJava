package br.com.estudojava.devdojo.introducaoclasses.Minterfaces.teste;

import br.com.estudojava.devdojo.introducaoclasses.Minterfaces.classes.Produto;
import br.com.estudojava.devdojo.introducaoclasses.Minterfaces.classes.Tributavel;

public class TesteProduto {

    public static void main(String[] args) {

        Produto p = new Produto("notbook", 4, 3000 );
        Tributavel t;



        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);


    }
}
