package br.com.estudojava.patterns.abstractfactory.exemplo1.product;

import br.com.estudojava.patterns.abstractfactory.exemplo1.product.CheckBox;

/**
 * EstudosJava
 *
 * @author cshen on 31/01/2023.
 */
public class WindowsCheckBox implements CheckBox {


    @Override
    public void paint() {
        System.out.println("windows checkbox");
    }
}
