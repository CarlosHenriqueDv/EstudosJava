package br.com.estudojava.patterns.builder.exemplo1;

/**
 * EstudosJava
 * objeto concreto de um carro manual
 * @author cshen on 20/01/2023.
 */
public class CarroManual {

    private final String tipoDoCarro;
    private final int assentos;
    private final String motor;
    private final String transmissao;
    private final String computadorDeBordo;
    private final boolean navegacaoGPS;


    public CarroManual(String tipoDoCarro, int assentos, String motor, String transmissao, String computadorDeBordo, boolean navegacaoGPS) {
        this.tipoDoCarro = tipoDoCarro;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorDeBordo = computadorDeBordo;
        this.navegacaoGPS = navegacaoGPS;
    }


    public String getTipoDoCarro() {
        return tipoDoCarro;
    }

    public int getAssentos() {
        return assentos;
    }

    public String getMotor() {
        return motor;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public String getComputadorDeBordo() {
        return computadorDeBordo;
    }

    public boolean isNavegacaoGPS() {
        return navegacaoGPS;
    }
}
