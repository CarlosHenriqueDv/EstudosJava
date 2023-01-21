package br.com.estudojava.desafiouri.iniciante;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1021NotasEMoedas {

    private enum Notas{

        CEM(100),
        CINQUENTA(50),
        VINTE(20),
        DEZ(10),
        CINCO(5),
        DOIS(2);
        int valor;
        Notas(int valor){
            this.valor = valor;

        }
    }

    private enum Moedas{

        UM_REAL(100),
        CINQUENTA(50),
        VINTE_E_CINCO(25),
        DEZ(10),
        CINCO(5),
        UM_CENTAVO(1);

        int valor;

        Moedas(int valor){
            this.valor = valor;
        }

    }

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);

        double valorEntrada = scan.nextDouble();

        Dinheiro dinheiro = new Dinheiro(valorEntrada);
        dinheiro.exibiValorEmNotas();
        dinheiro.exibeValorEmMoedas();


    }



    private static class Dinheiro{

        private int dinheiroEmNotas;
        private double dinheiroEmMoedas;
        private double valorEntrada;

        Dinheiro(double valorEntrada){
            this.valorEntrada = valorEntrada;
        }

        public void exibiValorEmNotas(){

            Locale local = new Locale("pt", "br");

            int valorTotal = (int) valorEntrada;
            int valorRestante = valorTotal;

            int qtdNotasCem = valorTotal / Notas.CEM.valor;
            System.out.println("NOTAS:");
            dinheiroEmNotas += qtdNotasCem * Notas.CEM.valor;

            System.out.println(qtdNotasCem + " nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.CEM.valor).replace(",", "."));
            valorRestante %= Notas.CEM.valor;

            int qtdNotasCinquenta = valorRestante / Notas.CINQUENTA.valor;
            System.out.println(qtdNotasCinquenta + " nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.CINQUENTA.valor).replace(",", "."));
            dinheiroEmNotas += qtdNotasCinquenta * Notas.CINQUENTA.valor;
            valorRestante %= Notas.CINQUENTA.valor;

            int qtdNotasVinte = valorRestante / Notas.VINTE.valor;
            System.out.println(qtdNotasVinte +  " nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.VINTE.valor).replace(",", "."));
            dinheiroEmNotas += qtdNotasVinte * Notas.VINTE.valor;
            valorRestante %= Notas.VINTE.valor;

            int qtdNotasDez = valorRestante / Notas.DEZ.valor;
            System.out.println(qtdNotasDez + " nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.DEZ.valor).replace(",", "."));
            dinheiroEmNotas += qtdNotasDez * Notas.DEZ.valor;
            valorRestante %= Notas.DEZ.valor;

            int qtdNotasCinco = valorRestante / Notas.CINCO.valor;
            System.out.println(qtdNotasCinco + " nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.CINCO.valor).replace(",", "."));
            dinheiroEmNotas += qtdNotasCinco * Notas.CINCO.valor;
            valorRestante %= Notas.CINCO.valor;

            int qtdNotasDois = valorRestante / Notas.DOIS.valor;
            System.out.println(qtdNotasDois + " nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.DOIS.valor).replace(",", "."));
            dinheiroEmNotas += qtdNotasDois * Notas.DOIS.valor;

        }

        public void exibeValorEmMoedas(){
            dinheiroEmMoedas = Math.floor((valorEntrada - dinheiroEmNotas) * 100);
            DecimalFormat d = new DecimalFormat("0,00");

            int moedas = (int) dinheiroEmMoedas;
            int valorRestante = moedas;

            System.out.println("MOEDAS:");
            int qtdMoedasUmReal = moedas / Moedas.UM_REAL.valor;
            System.out.println(qtdMoedasUmReal + " moeda(s) de R$ " + d.format(Moedas.UM_REAL.valor).replace(",", "."));

            valorRestante %= Moedas.UM_REAL.valor;
            int qtdMoedasCinquenta = valorRestante / Moedas.CINQUENTA.valor;
            System.out.println(qtdMoedasCinquenta + " moeda(s) de R$ " + d.format(Moedas.CINQUENTA.valor).replace(",", "."));

            valorRestante %= Moedas.CINQUENTA.valor;
            int qtdMoedasVinteEcinco = valorRestante / Moedas.VINTE_E_CINCO.valor;
            System.out.println(qtdMoedasVinteEcinco + " moeda(s) de R$ " + d.format(Moedas.VINTE_E_CINCO.valor).replace(",", "."));

            valorRestante %= Moedas.VINTE_E_CINCO.valor;
            int qtdMoedasDez = valorRestante / Moedas.DEZ.valor;
            System.out.println(qtdMoedasDez + " moeda(s) de R$ " + d.format(Moedas.DEZ.valor).replace(",", "."));

            valorRestante %= Moedas.DEZ.valor;
            int qtdMoedasCincoCentavos = valorRestante / Moedas.CINCO.valor;
            System.out.println(qtdMoedasCincoCentavos + " moeda(s) de R$ " + d.format(Moedas.CINCO.valor).replace(",", "."));

            valorRestante %= Moedas.CINCO.valor;
            int qtdMoedasUmCentavo = valorRestante / Moedas.UM_CENTAVO.valor;
            System.out.println(qtdMoedasUmCentavo + " moeda(s) de R$ " + d.format(Moedas.UM_CENTAVO.valor).replace(",", "."));



        }


    }




}
