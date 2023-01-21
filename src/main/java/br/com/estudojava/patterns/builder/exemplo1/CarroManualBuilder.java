package br.com.estudojava.patterns.builder.exemplo1;

/**
 * EstudosJava
 * objeto construtor de um carro manual
 * @author cshen on 20/01/2023.
 */
public class CarroManualBuilder implements Builder {

    private String tipoDoCarro;
    private int assentos;
    private String motor;
    private String transmissao;
    private String computadorDeBordo;
    private boolean navegacaoGPS;


    @Override
    public void setTipoDoCarro(String tipoDoCarro) {
        this.tipoDoCarro = tipoDoCarro;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setComputadorDeBordo(String computadorBordo) {
        this.computadorDeBordo = computadorBordo;
    }

    @Override
    public void setNavegacaoGPS(boolean navegacaoGPS) {
        this.navegacaoGPS = navegacaoGPS;
    }
}
