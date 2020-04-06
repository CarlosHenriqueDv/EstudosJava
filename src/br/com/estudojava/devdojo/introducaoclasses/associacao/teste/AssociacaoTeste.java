package br.com.estudojava.devdojo.introducaoclasses.associacao.teste;

import br.com.estudojava.devdojo.introducaoclasses.associacao.classes.Aluno;
import br.com.estudojava.devdojo.introducaoclasses.associacao.classes.Local;
import br.com.estudojava.devdojo.introducaoclasses.associacao.classes.Professor;
import br.com.estudojava.devdojo.introducaoclasses.associacao.classes.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", 24);
        Aluno aluno2 = new Aluno("Joana",25);
       Seminario seminario = new Seminario("Curso DevDojo");

        Professor prof1 = new Professor("William", "Java");
        Professor prof2 = new Professor("Guanabara", "Banco de Dados");
        Local local = new Local("Rua das arraras", "mato");


        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);


        seminario.setProfessor(prof1);
        seminario.setProfessor(prof2);
//        seminario.setLocal(local);
        //seminario.setAlunos(new Aluno[]{aluno1, aluno2});

        Seminario[] seminarioArray = new Seminario[1];
        seminarioArray[0] = seminario;
        prof1.setSeminarios(seminarioArray);
        prof2.setSeminarios(seminarioArray);

        seminario.print();
        prof1.print();



        
        

    }

}
