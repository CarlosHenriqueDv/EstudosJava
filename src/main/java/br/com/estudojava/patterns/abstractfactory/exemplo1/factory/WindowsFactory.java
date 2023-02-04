package br.com.estudojava.patterns.abstractfactory.exemplo1.factory;

import br.com.estudojava.patterns.abstractfactory.exemplo1.product.Button;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.CheckBox;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.WindowsButton;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.WindowsCheckBox;

/**
 * EstudosJava
 *
 * @author cshen on 31/01/2023.
 */
public class WindowsFactory implements GuiFactory {


    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }

}
