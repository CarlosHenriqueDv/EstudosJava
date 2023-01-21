package br.com.estudojava.patterns.builder.exemplo1;

/**
 * EstudosJava
 * Objecto concreto carro
 * @author cshen on 20/01/2023.
 */
public class Carro {

    private final String tipoDoCarro;
    private final int assentos;
    private final String motor;
    private final String transmissao;
    private final String computadorDeBordo;
    private final boolean navegacaoGPS;
    private double gasolina = 0;

    public Carro(String tipoDoCarro, int assentos, String motor, String transmissao, String computadorDeBordo, boolean navegacaoGPS) {
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

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoDoCarro='" + tipoDoCarro + '\'' +
                ", assentos=" + assentos +
                ", motor='" + motor + '\'' +
                ", transmissao='" + transmissao + '\'' +
                ", computadorDeBordo='" + computadorDeBordo + '\'' +
                ", navegacaoGPS=" + navegacaoGPS +
                ", gasolina=" + gasolina +
                '}';
    }
}
