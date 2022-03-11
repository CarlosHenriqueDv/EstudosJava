package br.com.estudojava.desafiouri.iniciante;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class URI2234CachorrosQuentes {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        BigDecimal hots = BigDecimal.valueOf(scan.nextInt());
        BigDecimal participantes = BigDecimal.valueOf(scan.nextInt());

        BigDecimal media = hots.divide(participantes, 2,RoundingMode.HALF_UP);
        System.out.println(media);



    }
}
