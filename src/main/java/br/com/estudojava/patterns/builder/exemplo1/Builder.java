package br.com.estudojava.patterns.builder.exemplo1;

/**
 * EstudosJava
 * Interface comum entre os objetos.
 * @author cshen on 20/01/2023.
 */
public interface Builder {

    void setTipoDoCarro(String tipoDoCarro);
    void setAssentos(int assentos);
    void setMotor(String motor);
    void setTransmissao(String transmissao);
    void setComputadorDeBordo(String computadorBordo);
    void setNavegacaoGPS(boolean navegacaoGPS);




}
