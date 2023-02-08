package br.com.estudojava.patterns.abstractfactory.exemplo2.factory;

import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Botao;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Painel;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public interface GuiFactory {

    Painel criaPainel();
    Botao criaBotao();

}
