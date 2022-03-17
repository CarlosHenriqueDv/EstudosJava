package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;
public class URI1043Triangulo {

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);

        Double a, b , c;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        //condição de existencia de triangulo
        //soma de dois lados sempre maior que a do terceiro
        //a + b > c
        //b + c > a
        //a + c > b


        if (isTriangulo(a, b, c)){
            System.out.println("Perimetro = " + calculaPerimetroTriangulo(a, b, c));
        }else{
            System.out.println("Area = " + calculaAreaTrapezio(a, b, c));
        }

    }

    public static boolean isTriangulo(double a, double b, double c){
        return ((a + b > c) && (b + c > a) && (a + c > b));
    }

    public static Double calculaPerimetroTriangulo(double a, double b, double c){
        return (a + b + c);
    }

    public static Double calculaAreaTrapezio(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura / 2);

    }

}
