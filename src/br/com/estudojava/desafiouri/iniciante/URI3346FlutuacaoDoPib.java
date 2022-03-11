package br.com.estudojava.desafiouri.iniciante;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI3346FlutuacaoDoPib {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigDecimal entrada1 = BigDecimal.valueOf(scanner.nextDouble())
                .divide(BigDecimal.valueOf(100), 6,RoundingMode.HALF_UP)
                .add(BigDecimal.ONE);

        BigDecimal entrada2 = BigDecimal.valueOf(scanner.nextDouble())
                .divide(BigDecimal.valueOf(100), 6,RoundingMode.HALF_UP)
                .add(BigDecimal.ONE);


        BigDecimal flutuacaoPib = entrada1
                .multiply(entrada2)
                .subtract(BigDecimal.ONE)
                .multiply(BigDecimal.valueOf(100)).setScale(6, RoundingMode.HALF_UP);

        System.out.println(flutuacaoPib);



    }
}
