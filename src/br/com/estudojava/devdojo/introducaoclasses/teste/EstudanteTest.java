package br.com.estudojava.devdojo.introducaoclasses.teste;

import br.com.estudojava.devdojo.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante joao = new Estudante();

        joao.nome= "joao";
        joao.idade = 15;
        joao.matricula = 12345;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }

}
