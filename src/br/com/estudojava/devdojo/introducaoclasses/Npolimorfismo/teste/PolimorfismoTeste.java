package br.com.estudojava.devdojo.introducaoclasses.Npolimorfismo.teste;

import br.com.estudojava.devdojo.introducaoclasses.Npolimorfismo.classes.Gerente;
import br.com.estudojava.devdojo.introducaoclasses.Npolimorfismo.classes.RelatorioPagamento;
import br.com.estudojava.devdojo.introducaoclasses.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTeste {

    public static void main(String[] args) {
        Gerente g = new Gerente("Carlos", 4200, 2000);
        Vendedor v = new Vendedor("Malvina", 5000, 20000);

        RelatorioPagamento relatorio = new RelatorioPagamento();

//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("-----------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-------------------------");
        relatorio.relatorioPagamentoGenerico(v);

    }
}
