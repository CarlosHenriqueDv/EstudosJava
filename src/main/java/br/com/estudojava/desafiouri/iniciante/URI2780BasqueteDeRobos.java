package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;
public class URI2780BasqueteDeRobos {

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();

        if (distancia <= 800){
            System.out.println(1);
        }else System.out.println(distancia <= 1400 ? 2 : 3);

    }
}
