package br.com.estudojava.desafiouri.iniciante;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class URI1038Lanche {

    public enum TabelaLanches{

        CACHORRO_QUENTE(1, "Cachorro Quente", 4.00),
        X_SALADA(2, "X-Salada", 4.50),
        X_BACON(3, "X-Bacon", 5.00),
        TORRADA_SIMPLES(4,"Torrada simples", 2.00),
        REFRIGERANTE(5, "Refrigerante", 1.50);

        private int codigo;
        private String especificacao;
        private double preco;

        TabelaLanches(int codigo, String especificacao, double preco){
            this.codigo = codigo;
            this.especificacao = especificacao;
            this.preco = preco;
        }

        private static TabelaLanches getTipoLanchePorCodigo(int codigo){
            for (TabelaLanches lanche : values()){
                if (lanche.codigo == codigo){
                    return lanche;
                }

            }
            return null;
        }

    }

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);

        int codigoProduto = scan.nextInt();
        int quantidadeProduto = scan.nextInt();

        TabelaLanches lanche = TabelaLanches.getTipoLanchePorCodigo(codigoProduto);

        if (lanche != null){
            calculaTotal(lanche, quantidadeProduto);
        }



    }

    public static void calculaTotal(TabelaLanches lanche, int quantidadeProduto){

        Locale local = new Locale("pt", "br");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(local);

        double valorTotal = lanche.preco * quantidadeProduto;
        System.out.println("Total: " + numberFormat.format(valorTotal).replace(",", "."));

    }
}
