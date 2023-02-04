package br.com.estudojava.patterns.abstractfactory.exemplo1.factory;

import br.com.estudojava.patterns.abstractfactory.exemplo1.product.Button;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.CheckBox;

/**
 * EstudosJava
 * Representa uma fabrica abstrata
 * @author cshen on 31/01/2023.
 */
public interface GuiFactory {

    Button createButton();
    CheckBox createCheckbox();


}
