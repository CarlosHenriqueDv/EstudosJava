package br.com.estudojava.desafiouri.iniciante;

import java.time.*;
import java.time.chrono.Chronology;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Scanner;

public class URI1020IdadeEmDias {

    static final int DIAS_DO_ANO = 365;
    static final int DIAS_DO_MES = 30;
    static final int MESES_DO_ANO = 12;

    public static void main (String... args){

        Scanner scan = new Scanner(System.in);

        int entradaEmDias = scan.nextInt();
        //fazendo na mão
        System.out.println(getAnosDeDias(entradaEmDias) + " ano(s)");
        System.out.println(getMesesDeDias(entradaEmDias) + " mes(es)");
        System.out.println(getDiasDeDias(entradaEmDias) + " dia(s)");

        //fazendo com API'S do Java
//        LocalDate local = LocalDate.now().minusDays(entradaEmDias);
//        LocalDate now =  LocalDate.now().plusDays(1);
//        Period between = Period.between(local, now);
//
//        System.out.println(between.getYears() + " years");
//        System.out.println(between.getMonths() + " months");
//        System.out.println(between.getDays() + " days");

    }

    public static int getAnosDeDias(int dias){
        return dias / DIAS_DO_ANO;
    }

    public static int getMesesDeDias(int dias){
        return (dias % DIAS_DO_ANO) / DIAS_DO_MES;
    }

    public static int getDiasDeDias(int dias){
        return (dias % DIAS_DO_ANO) % DIAS_DO_MES;
    }


}
