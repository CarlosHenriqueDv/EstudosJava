package br.com.estudojava.estruturadedados.testes;

import br.com.estudojava.estruturadedados.classes.Aluno;

import java.util.ArrayList;

public class ArrayListTeste {

    public static void main(String[] args) {
        ArrayList vetor = new ArrayList();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        vetor.add(a1);
        vetor.add(a2);
        vetor.add(a3);

        int tamanho = vetor.size();

        if (tamanho != 3){
            System.out.println("O tamanho do vetor está errado!");
        }

        if (!vetor.contains(a1)){
            System.out.println("Aluno não encontrado na lista");
        }

        vetor.remove(0);
        tamanho = vetor.size();

        if (tamanho != 2){
            System.out.println("O tamanho da lista está errado!");
        }




    }




}
