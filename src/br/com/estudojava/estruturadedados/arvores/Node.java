package br.com.estudojava.estruturadedados.arvores;

/**
 * EstudosJava
 *
 * @author cshen on 21/08/2022.
 */
public class Node {

    private Integer valor;

    private Node leftNode;
    private Node rightNode;


    public Node(Integer valor) {
        this.valor = valor;
    }

    public Node() {
    }


    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" + "valor=" + valor +'}';
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
