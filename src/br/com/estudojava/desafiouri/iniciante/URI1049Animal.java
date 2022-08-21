package br.com.estudojava.desafiouri.iniciante;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 * EstudosJava
 *
 * @author cshen on 20/08/2022.
 */
public class URI1049Animal {

    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);
        String chave1;
        String chave2;
        String chave3;

        chave1 = scan.next();
        chave2 = scan.next();
        chave3 = scan.next();

        if (chave1.equals("vertebrado")) {
            if (chave2.equals("ave")) {
                if (chave3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (chave3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }

            }
        } else {
            if (chave2.equals("inseto")){
                if (chave3.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if (chave3.equals("hematofago")){
                    System.out.println("sanguesuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }


    }


    public interface Animal{
        String getTipo();
    }



}
