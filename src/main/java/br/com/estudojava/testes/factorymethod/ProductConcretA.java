package br.com.estudojava.testes.factorymethod;

/**
 * EstudosJava
 *
 * @author cshen on 21/08/2022.
 */
public class ProductConcretA implements Product {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
