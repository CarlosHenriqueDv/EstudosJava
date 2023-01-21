package br.com.estudojava.devdojomaratonajava.Lclassesabstratas.testes;

import br.com.estudojava.devdojomaratonajava.Lclassesabstratas.classes.Gerente;
import br.com.estudojava.devdojomaratonajava.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {



        Gerente g = new Gerente("goku", "12555", 2000);
        Vendedor v = new Vendedor("Carlos", "121321", 1500, 5000);

        g.calculaSalario();
        v.calculaSalario();

        System.out.println(g);
        System.out.println("-----------");
        System.out.println(v);
    }
}
