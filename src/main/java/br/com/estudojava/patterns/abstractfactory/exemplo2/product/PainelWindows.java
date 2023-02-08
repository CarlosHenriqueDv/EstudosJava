package br.com.estudojava.patterns.abstractfactory.exemplo2.product;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class PainelWindows implements Painel {

    private boolean visivel;
    private static final String tipoPainel = "Windows";

    public PainelWindows(boolean visivel) {
        this.visivel = visivel;
    }

    @Override
    public boolean isVisivel() {
        return this.visivel;
    }

    @Override
    public String tipoPainel() {
        return "Painel: " + tipoPainel;
    }
}
