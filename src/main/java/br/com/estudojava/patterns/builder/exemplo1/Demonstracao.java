package br.com.estudojava.patterns.builder.exemplo1;

/**
 * EstudosJava
 *
 * @author cshen on 21/01/2023.
 */
public class Demonstracao {

    public static void main(String[] args) {


        CarroBuilder builder = new CarroBuilder();
        Diretor diretor = new Diretor(builder);
        //diretor.construirCarroSport(builder);

        diretor.construirCarroSport();

        Carro carro = builder.getResult();
        System.out.println(carro);



    }
}
