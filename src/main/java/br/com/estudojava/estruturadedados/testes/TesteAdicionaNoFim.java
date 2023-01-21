package br.com.estudojava.estruturadedados.testes;

import br.com.estudojava.estruturadedados.classes.Aluno;
import br.com.estudojava.estruturadedados.classes.Vetor;

public class TesteAdicionaNoFim {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Carlos");
        a2.setNome("Malvina");

        Vetor lista = new Vetor();

        lista.adicionaAluno(a1);
        lista.adicionaAluno(a2);

//        System.out.println(lista);

        lista.contem(a2);


    }
}
