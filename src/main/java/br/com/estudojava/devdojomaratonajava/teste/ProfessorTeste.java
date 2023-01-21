package br.com.estudojava.devdojomaratonajava.teste;

import br.com.estudojava.devdojomaratonajava.classes.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome="Carlos";
        prof.cpf="120.458.878-58";
        prof.matricula = "123548-1";
        prof.rg= 123548;

        System.out.println("Nome: " + prof.nome);
        System.out.println("CPF: " + prof.cpf);
        System.out.println("Matrícula " + prof.matricula);
        System.out.println("RG: " + prof.rg);
        System.out.println("-----------------------");



        Professor prof2 = new Professor();

        prof2.nome="Maria";
        prof2.cpf="555.000.878-58";
        prof2.matricula = "154848-1";
        prof2.rg= 458741;

        System.out.println("Nome: " + prof2.nome);
        System.out.println("CPF: " + prof2.cpf);
        System.out.println("Matrícula " + prof2.matricula);
        System.out.println("RG: " + prof2.rg);




    }
}
