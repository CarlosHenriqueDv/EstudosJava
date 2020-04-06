package br.com.estudojava.devdojo.introducaoclasses.heranca.teste;

import br.com.estudojava.devdojo.introducaoclasses.heranca.classes.Endereco;
import br.com.estudojava.devdojo.introducaoclasses.heranca.classes.Funcionario;
import br.com.estudojava.devdojo.introducaoclasses.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        Endereco endereco = new Endereco();

        p.setNome("Carlos");
        p.setCpf("123.456.789-21");
                
        endereco.setBairro("Marambaia");
        endereco.setRua("Av. Dalva");
        p.setEndereco(endereco);

        p.imprime();
        System.out.println("----------------------");
        Funcionario f = new Funcionario();
        f.setNome("Augusto");
        f.setCpf("123.654.789-96");
        f.setEndereco(endereco);
        f.setSalario(15225);
        f.imprime();

        f.imprimeReciboPagamento();

    }
}
