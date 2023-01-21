package br.com.estudojava.patterns.builder.exemplo1;

/**
 * EstudosJava
 * O diretor sabe as etapas de construção dos objetos específicos
 * Ele encapsula as regras de criação.
 * @author cshen on 20/01/2023.
 */
public class Diretor {

    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }

    public Diretor() {
    }

    public void construirCarroSport(){
        if (this.builder == null){
            throw new IllegalArgumentException("O diretor deve possuir um builder");
        }

        this.construirCarroSport(this.builder);


    }

    public void construirCarroSport(Builder builder){

        builder.setTipoDoCarro("Carro Esport");
        builder.setAssentos(2);
        builder.setMotor("v3");
        builder.setTransmissao("AUTOMATICA");
        builder.setNavegacaoGPS(true);

    }

    public void construirCarroDaCidade(Builder builder){
        builder.setTipoDoCarro("Carro da cidade");
        builder.setAssentos(4);
        builder.setMotor("1.0");
        builder.setTransmissao("MANUAL");
        builder.setNavegacaoGPS(true);
    }



}
