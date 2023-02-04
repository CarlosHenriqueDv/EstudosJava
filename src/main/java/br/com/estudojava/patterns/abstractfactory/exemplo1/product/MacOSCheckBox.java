package br.com.estudojava.patterns.abstractfactory.exemplo1.product;

/**
 * EstudosJava
 * Representa o produto concreto
 * @author cshen on 31/01/2023.
 */
public class MacOSCheckBox implements CheckBox {


    @Override
    public void paint() {
        System.out.println("MacOS Checkbox");
    }
}
