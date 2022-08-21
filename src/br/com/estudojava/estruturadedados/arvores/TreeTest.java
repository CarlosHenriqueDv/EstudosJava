package br.com.estudojava.estruturadedados.arvores;

/**
 * EstudosJava
 *
 * @author cshen on 21/08/2022.
 */
public class TreeTest {

    public static void main(String[] args) {

        BinaryTree arvore = new BinaryTree();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(90);
        arvore.inserir(100);

        arvore.imprimeArvore();




    }
}
