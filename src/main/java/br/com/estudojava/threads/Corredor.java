package br.com.estudojava.threads;

/**
 * EstudosJava
 *
 * @author cshen on 28/12/2022.
 */
public class Corredor implements Runnable{

    private String nome;

    private int passos = 1;
    private int colocacao;

    private static int contador = 1;
    private static int qtdCorredor;

    private static Corredor[] corredores = new Corredor[10];

    public Corredor(String nome) {
        this.nome = nome;
        corredores[qtdCorredor] = this;
        qtdCorredor++;
    }

    public void imprime(){

        for (int i = 0; i < qtdCorredor; i++){
            System.out.println("\n Corredor( " + corredores[i].nome + " ): ");
            for (int j = 0; j < corredores[i].passos; j++){
                System.out.print('>');
            }
        }
        System.out.println();

    }



    @Override
    public void run() {

        int tempo;
        while (true){
            imprime();
            passos++;
            try {
                if (passos == 30){
                    colocacao = contador++;
                    break;
                }

                tempo = (int) (Math.random() * 500);

                Thread.sleep(tempo);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
