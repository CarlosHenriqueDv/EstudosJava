package br.com.estudojava.patterns.abstractfactory.exemplo2;

import br.com.estudojava.patterns.abstractfactory.exemplo2.factory.GuiFactory;
import br.com.estudojava.patterns.abstractfactory.exemplo2.factory.LinuxGuiFactory;
import br.com.estudojava.patterns.abstractfactory.exemplo2.factory.WindowsGuiFactory;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Botao;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Painel;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class GuiMain {

    public static void main(String[] args) {

        GuiFactory windowsFactory = new WindowsGuiFactory();
        GuiFactory linuxFactory = new LinuxGuiFactory();

        App windowsApp = new App(windowsFactory);
        windowsApp.configuracaoGuiApplication();;




    }
}
