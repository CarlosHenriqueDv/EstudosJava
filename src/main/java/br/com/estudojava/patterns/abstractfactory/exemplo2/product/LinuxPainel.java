package br.com.estudojava.patterns.abstractfactory.exemplo2.product;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class LinuxPainel implements Painel {

    private boolean visivel;
    private static final String tipoPainel = "Linux";

    public LinuxPainel(boolean visivel) {
        this.visivel = visivel;
    }

    @Override
    public boolean isVisivel() {
        return false;
    }

    @Override
    public String tipoPainel() {
        return "Painel: " + tipoPainel;
    }
}
