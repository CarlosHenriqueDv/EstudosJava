package br.com.estudojava.patterns.abstractfactory.exemplo2.factory;

import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Botao;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.BotaoWindows;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Painel;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.PainelWindows;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Painel criaPainel() {
        return new PainelWindows(true);
    }

    @Override
    public Botao criaBotao() {
        return new BotaoWindows();
    }
}
