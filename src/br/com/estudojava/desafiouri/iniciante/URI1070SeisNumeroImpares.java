package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;
public class URI1070SeisNumeroImpares {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int entrada = s.nextInt();

        int imparesExibidos = 0;
        while (imparesExibidos < 6) {
            boolean isImpar = entrada % 2 != 0;
            if (isImpar) {
                System.out.println(entrada);
                imparesExibidos++;
            }
            entrada = +entrada + 1;

        }
    }

}
