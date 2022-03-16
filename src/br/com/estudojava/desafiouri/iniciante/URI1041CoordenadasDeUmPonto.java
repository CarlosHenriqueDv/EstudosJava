package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;
public class URI1041CoordenadasDeUmPonto {

    private static Object Boolean;

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);

        Double x = scan.nextDouble();
        Double y = scan.nextDouble();


        if (!isOrigem(x, y)) {
            if (isSobreEixoY(x, y)) {
                System.out.println("Eixo Y");

            } else if (isSobreEixoX(x, y)) {
                System.out.println("Eixo X");

            } else if (isQuadranteQ1(x, y)) {
                System.out.println("Q1");

            } else if (isQuadranteQ2(x, y)) {
                System.out.println("Q2");

            } else if (isQuadranteQ3(x, y)) {
                System.out.println("Q3");

            } else {
                System.out.println("Q4");
            }
        } else {
            System.out.println("Origem");

        }


    }

    public static boolean isOrigem(Double x, Double y){
        return x.compareTo(0.0) == 0 && y.compareTo(0.0) == 0;
    }

    public static boolean isSobreEixoY(Double x, Double y){
        return x.compareTo(0.0) == 0;
    }

    public static boolean isSobreEixoX(Double x, Double y){
        return y.compareTo(0.0) == 0;
    }

    public static boolean isQuadranteQ1(Double x, Double y){
        return x.compareTo(0.0) > 0 && y.compareTo(0.0) > 0;
    }

    public static boolean isQuadranteQ2(Double x, Double y){
        return x.compareTo(0.0) < 0 && y.compareTo(0.0) > 0;
    }

    public static boolean isQuadranteQ3(Double x, Double y){
        return x.compareTo(0.0) < 0 && y.compareTo(0.0) < 0;
    }





}
