package br.com.estudojava.patterns.abstractfactory.exemplo1;

import br.com.estudojava.patterns.abstractfactory.exemplo1.factory.GuiFactory;
import br.com.estudojava.patterns.abstractfactory.exemplo1.factory.MacOSFactory;
import br.com.estudojava.patterns.abstractfactory.exemplo1.factory.WindowsFactory;

/**
 * EstudosJava
 *
 * @author cshen on 31/01/2023.
 */
public class Demo {

    private static Application configureApplication(){
        Application app; // client
        GuiFactory factory; //abstract factory
        String osName = System.getProperty("os.name").toLowerCase();


        if (osName.contains("mac")){
            factory = new MacOSFactory();
        }else{
            factory = new WindowsFactory();
        }

        app = new Application(factory);

        return app;

    }

    public static void main(String[] args) {
        Application app = configureApplication();

        app.paint();
    }



}
