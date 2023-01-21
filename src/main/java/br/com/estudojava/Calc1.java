package br.com.estudojava;

import org.springframework.stereotype.Service;

/**
 * EstudosJava
 *
 * @author cshen on 16/01/2023.
 */
@Service
public class Calc1 implements Calculo {
    @Override
    public void imprimeCalculo() {
        System.out.println(5+5);
    }
}
