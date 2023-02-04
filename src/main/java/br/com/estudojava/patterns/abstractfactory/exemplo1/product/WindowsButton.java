package br.com.estudojava.patterns.abstractfactory.exemplo1.product;

import br.com.estudojava.patterns.abstractfactory.exemplo1.product.Button;

/**
 * EstudosJava
 *
 * @author cshen on 31/01/2023.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
