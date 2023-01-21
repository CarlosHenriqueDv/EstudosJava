package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;
import java.util.stream.IntStream;

public class URI2939QuantaMandioca {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] porcoes = {300, 1500,600,1000,150};

        int contadorEntradas = 0;
        int totalPorcoes = 0;

        while (contadorEntradas < 5){
            totalPorcoes = totalPorcoes + (scan.nextInt() * porcoes[contadorEntradas]);
            contadorEntradas++;
        }
        int porcaoDonaChica = 225;
        System.out.println(totalPorcoes + porcaoDonaChica);






    }
}
