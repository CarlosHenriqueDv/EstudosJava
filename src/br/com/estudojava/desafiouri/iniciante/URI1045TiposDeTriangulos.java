package br.com.estudojava.desafiouri.iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * EstudosJava
 *
 * @author cshen on 25/04/2022.
 */
public class URI1045TiposDeTriangulos {

    private static final String NAO_E_TRIANGULO = "NAO FORMA TRIANGULO";
    private static final String TRIANGULO_RETANGULO = "TRIANGULO RETANGULO";
    private static final String TRIANGULO_OBTUSANGULO = "TRIANGULO OBTUSANGULO";
    private static final String TRIANGULO_ACUTANGULO = "TRIANGULO ACUTANGULO";
    private static final String TRIANGULO_EQUILATERO = "TRIANGULO EQUILATERO";
    private static final String TRIANGULO_ISOSCELES = "TRIANGULO ISOSCELES";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> lados = new ArrayList<>();

        lados.add(scan.nextDouble());
        lados.add(scan.nextDouble());
        lados.add(scan.nextDouble());

        Collections.sort(lados);

        if (lados.get(0) >= lados.get(1) + lados.get(2) ){
            System.out.println(NAO_E_TRIANGULO);
        }

        if (Math.pow(lados.get(0), 2) == Math.pow(lados.get(1), 2) + Math.pow(lados.get(2), 2)){
            System.out.println(TRIANGULO_RETANGULO);
        }

        if (Math.pow(lados.get(0), 2) > Math.pow(lados.get(1), 2) + Math.pow(lados.get(2), 2)){
            System.out.println(TRIANGULO_OBTUSANGULO);
        }

        if (Math.pow(lados.get(0), 2) < Math.pow(lados.get(1), 2) + Math.pow(lados.get(2), 2)){
            System.out.println(TRIANGULO_ACUTANGULO);
        }

        if (lados.get(0).equals(lados.get(1)) && lados.get(0).equals(lados.get(2))){
            System.out.println(TRIANGULO_EQUILATERO);
        }

        if (lados.get(0).equals(lados.get(1)) ^ lados.get(1).equals(lados.get(2)) ^ lados.get(0).equals(lados.get(2)) ){
            System.out.println(TRIANGULO_ISOSCELES);
        }



    }


}
