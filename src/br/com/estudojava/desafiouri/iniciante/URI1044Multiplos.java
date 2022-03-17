package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;
public class URI1044Multiplos {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }


    }
}
