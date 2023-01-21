package br.com.estudojava.devdojomaratonajava.teste;

import br.com.estudojava.devdojomaratonajava.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo= "Fusca";
        carro.placa="abc1548";
        carro.velocidadeMaxima = 120;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);

    }
}
