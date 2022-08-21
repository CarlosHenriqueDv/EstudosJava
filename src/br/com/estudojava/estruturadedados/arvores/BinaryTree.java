package br.com.estudojava.estruturadedados.arvores;

/**
 * EstudosJava
 *
 * @author cshen on 21/08/2022.
 */
public class BinaryTree {

    private Node root;



    public boolean isEmpty(){
        return this.root == null;
    }

    public int getAltura(){
        return getAltura(this.root);
    }

    private int getAltura(Node root){
        if (isEmpty()){
            return 0;
        }
        int altEsquerda = getAltura(this.root.getLeftNode());
        int altDireita = getAltura(this.root.getRightNode());

        if (altEsquerda > altDireita){
            return altEsquerda +1;
        }else{
            return altDireita + 1;
        }

    }

    public int getQtdNodes(){
        return getQtdNodes(root);
    }

    private int getQtdNodes(Node root){
        if (isEmpty()){
            return 0;
        }
        int qtdNodeEsq = getQtdNodes(root.getLeftNode());
        int qtdNodeDireita = getQtdNodes(root.getRightNode());
        return qtdNodeEsq + qtdNodeDireita + 1;
    }

    public void imprimeArvore(){
        if (isEmpty()){
            System.out.println("arvore vazia");
        }
        imprimeArvore(root);
    }

    private void imprimeArvore(Node node){
        if (node.getLeftNode() != null){
            imprimeArvore(node.getLeftNode());
        }

        if (node.getRightNode() != null){
            imprimeArvore(node.getRightNode());
        }
        System.out.println("Nó " + node.getValor());
    }

    public void inserir(Integer valor){
        inserir(root, valor);
    }

    public void inserir(Node node, Integer valor){
        if (this.root == null){
            this.root = new Node(valor);
        }else{
            if (valor < node.getValor()){
                if (node.getLeftNode() != null){
                    inserir(node.getLeftNode(), valor);
                }else{
                    node.setLeftNode(new Node(valor));
                }
            }else if(valor > node.getValor()){
                if (node.getRightNode() != null){
                    inserir(node.getRightNode(), valor);
                }else{
                    node.setRightNode(new Node(valor));
                }

            }
        }

    }

    public Node remover(int valor) throws Exception{
        return remover(this.root, valor);
    }

    private Node remover(Node root, int valor) throws Exception{
        if (this.root == null){
            throw new Exception("Arvore vazia");
        }

        if (valor < root.getValor()){
            root.setLeftNode(remover(root.getLeftNode(), valor));
        } else if (valor > root.getValor()) {
            root.setRightNode(remover(root.getRightNode(), valor));
        }else if(root.getLeftNode() != null && root.getRightNode() != null){
            System.out.println("  Removeu No " + root.getValor());
            root.setValor(encontrarMinimo(root.getRightNode()).getValor());
            root.setRightNode(removeMinimo(root.getRightNode()));
        }else{
            System.out.println("  Removeu No " + root.getValor());
            root = (root.getLeftNode() != null) ? root.getLeftNode() : root.getRightNode();
        }
        return root;
    }

    private Node encontrarMinimo(Node node){
        if (node != null) {
            while (node.getLeftNode() != null) {
                node = node.getLeftNode();
            }
        }
        return node;

    }

    private Node removeMinimo(Node node){
        if (node == null){
            System.out.println("ERRO");
        }else if(node.getLeftNode() != null){
            node.setLeftNode(removeMinimo(node.getLeftNode()));
            return node;
        }else{
            return node.getRightNode();
        }
        return null;
    }



}
