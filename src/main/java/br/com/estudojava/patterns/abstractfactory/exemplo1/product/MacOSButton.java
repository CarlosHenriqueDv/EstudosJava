package br.com.estudojava.patterns.abstractfactory.exemplo1.product;

/**
 * EstudosJava
 * representa o produto concreto
 * @author cshen on 31/01/2023.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac OS Button");
    }
}
