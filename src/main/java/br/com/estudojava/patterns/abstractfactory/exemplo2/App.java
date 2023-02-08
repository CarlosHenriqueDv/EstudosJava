package br.com.estudojava.patterns.abstractfactory.exemplo2;

import br.com.estudojava.patterns.abstractfactory.exemplo2.factory.GuiFactory;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Botao;
import br.com.estudojava.patterns.abstractfactory.exemplo2.product.Painel;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class App {

    private Painel painel;
    private Botao botao;

    public App(GuiFactory guiFactory) {
        this.painel = guiFactory.criaPainel();
        this.botao = guiFactory.criaBotao();
    }

    public void configuracaoGuiApplication(){
        System.out.println(this.painel.tipoPainel());
        System.out.println(this.botao.tipoBotao());
    }
}
