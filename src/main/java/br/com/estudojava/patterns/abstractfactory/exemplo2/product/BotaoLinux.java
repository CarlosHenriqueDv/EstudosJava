package br.com.estudojava.patterns.abstractfactory.exemplo2.product;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class BotaoLinux implements Botao {

    private static final String tipoBotao = "Linux";

    @Override
    public void click() {
        System.out.println("Click " + tipoBotao);
    }

    @Override
    public String tipoBotao() {
        return "Tipo Botao: " + tipoBotao;
    }


}
