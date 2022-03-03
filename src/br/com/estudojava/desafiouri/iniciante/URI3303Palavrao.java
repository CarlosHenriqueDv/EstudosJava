package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;

public class URI3303Palavrao {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String palavra = scan.next();

        if (palavra.length() >= 10){
            System.out.println("palavrao");
        }else{
            System.out.println("palavrinha");
        }

    }



}
