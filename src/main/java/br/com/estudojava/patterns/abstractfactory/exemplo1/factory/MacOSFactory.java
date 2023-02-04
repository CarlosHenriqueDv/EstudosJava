package br.com.estudojava.patterns.abstractfactory.exemplo1.factory;

import br.com.estudojava.patterns.abstractfactory.exemplo1.product.Button;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.CheckBox;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.MacOSButton;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.MacOSCheckBox;

/**
 * EstudosJava
 * Representa uma classe concreta
 * @author cshen on 31/01/2023.
 */
public class MacOSFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }


}
