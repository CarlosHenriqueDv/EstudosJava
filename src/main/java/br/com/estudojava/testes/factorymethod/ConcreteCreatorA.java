package br.com.estudojava.testes.factorymethod;

/**
 * EstudosJava
 *
 * @author cshen on 21/08/2022.
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ProductConcretA();
    }
}
