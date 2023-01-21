package br.com.estudojava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * EstudosJava
 *
 * @author cshen on 16/01/2023.
 */

public class TesteCalc {

    @Resource(name = "Calc1")
    private static Calculo calculo;

    public static void main(String[] args) {

        calculo.imprimeCalculo();

    }
}
