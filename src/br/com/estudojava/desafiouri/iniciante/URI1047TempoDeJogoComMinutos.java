package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;
public class URI1047TempoDeJogoComMinutos {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();

        int horaFinal = scan.nextInt();
        int minutoFinal =scan.nextInt();


        int duracaoHoras = horaFinal - horaInicial;
        int duracaoMinutos = minutoFinal - minutoInicial;

        if (duracaoMinutos < 0){
            duracaoMinutos += 60;
            duracaoHoras--;
        }

        if (duracaoHoras < 0){
            duracaoHoras += 24;
        }

        if(horaInicial == horaFinal && minutoInicial == minutoFinal){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else{
            System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        }





    }
}
