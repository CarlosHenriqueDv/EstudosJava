package br.com.estudojava.patterns.abstractfactory.exemplo1;

import br.com.estudojava.patterns.abstractfactory.exemplo1.factory.GuiFactory;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.Button;
import br.com.estudojava.patterns.abstractfactory.exemplo1.product.CheckBox;

/**
 * EstudosJava
 *
 * @author cshen on 31/01/2023.
 */
public class Application {

    private Button button;
    private CheckBox checkBox;


    public Application(GuiFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckbox();
    }


    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
