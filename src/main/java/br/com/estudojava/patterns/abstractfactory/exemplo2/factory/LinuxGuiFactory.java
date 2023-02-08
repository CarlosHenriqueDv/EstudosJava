package br.com.estudojava.patterns.abstractfactory.exemplo2.factory;

import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Botao;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.BotaoLinux;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.LinuxPainel;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Painel;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Painel criaPainel() {
        return new LinuxPainel(true);
    }

    @Override
    public Botao criaBotao() {
        return new BotaoLinux();
    }
}
