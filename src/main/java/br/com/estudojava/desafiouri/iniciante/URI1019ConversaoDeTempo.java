package br.com.estudojava.desafiouri.iniciante;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public class URI1019ConversaoDeTempo {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int entrada = in.nextInt();

        //fazendo na mão
        //horas
        int horas = entrada / 3600;
        entrada = entrada - horas * 3600;

        //minutos
        int minutos = entrada / 60;

        entrada = entrada - minutos * 60;
        int segundos = entrada;

        System.out.println(horas + ":" + minutos + ":" + segundos);


        //usando a API do java
        Duration duration = Duration.of(entrada, ChronoUnit.SECONDS);

        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();
        long seconds = duration.minusHours(hours).minusMinutes(minutes).getSeconds();
        System.out.println(hours + ":" + minutes + ":" + seconds);


    }

}
