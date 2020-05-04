package br.com.estudojava.devdojo.introducaoclasses.Lclassesabstratas.testes;

import br.com.estudojava.devdojo.introducaoclasses.Lclassesabstratas.classes.Funcionario;
import br.com.estudojava.devdojo.introducaoclasses.Lclassesabstratas.classes.Gerente;
import br.com.estudojava.devdojo.introducaoclasses.Lclassesabstratas.classes.Vendedor;

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
