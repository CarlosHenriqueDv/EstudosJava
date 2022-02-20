package br.com.estudojava.desafiouri.iniciante;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

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

        double valorEntrada = 91.01;

        Dinheiro dinheiro = new Dinheiro(valorEntrada);
        dinheiro.exibiValorEmNotas();
        dinheiro.exibeValorEmMoedas();



        //extraiNotas(valorEntrada);
        //extraiMoedas(valorEntrada);

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
            DecimalFormat d = new DecimalFormat("00.00");

            System.out.println(d.format(Notas.CEM.valor));

            int valorTotal = (int) valorEntrada;
            int valorRestante = valorTotal;

            int qtdNotasCem = valorTotal / Notas.CEM.valor;
            System.out.println("NOTAS:");
            dinheiroEmNotas += qtdNotasCem * Notas.CEM.valor;

            System.out.println(qtdNotasCem + " Nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.CEM.valor));
            valorRestante %= Notas.CEM.valor;

            int qtdNotasCinquenta = valorRestante / Notas.CINQUENTA.valor;
            System.out.println(qtdNotasCinquenta + " Nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.CINQUENTA.valor));
            dinheiroEmNotas += qtdNotasCinquenta * Notas.CINQUENTA.valor;
            valorRestante %= Notas.CINQUENTA.valor;

            int qtdNotasVinte = valorRestante / Notas.VINTE.valor;
            System.out.println(qtdNotasVinte +  " Nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.VINTE.valor));
            dinheiroEmNotas += qtdNotasVinte * Notas.VINTE.valor;
            valorRestante %= Notas.VINTE.valor;

            int qtdNotasDez = valorRestante / Notas.DEZ.valor;
            System.out.println(qtdNotasDez + " Nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.DEZ.valor));
            dinheiroEmNotas += qtdNotasDez * Notas.DEZ.valor;
            valorRestante %= Notas.DEZ.valor;

            int qtdNotasCinco = valorRestante / Notas.CINCO.valor;
            System.out.println(qtdNotasCinco + " Nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.CINCO.valor));
            dinheiroEmNotas += qtdNotasCinco * Notas.CINCO.valor;
            valorRestante %= Notas.CINCO.valor;

            int qtdNotasDois = valorRestante / Notas.DOIS.valor;
            System.out.println(qtdNotasDois + " Nota(s) de " + NumberFormat.getCurrencyInstance(local).format(Notas.DOIS.valor));
            dinheiroEmNotas += qtdNotasDois * Notas.DOIS.valor;

        }

        public void exibeValorEmMoedas(){
            dinheiroEmMoedas = Math.floor((valorEntrada - dinheiroEmNotas) * 100);
            DecimalFormat d = new DecimalFormat("0,00");

            int moedas = (int) dinheiroEmMoedas;
            int valorRestante = moedas;

            System.out.println("MOEDAS:");
            int qtdMoedasUmReal = moedas / Moedas.UM_REAL.valor;
            System.out.println(qtdMoedasUmReal + " moeda(s) de R$ " + d.format(Moedas.UM_REAL.valor));




        }


    }




}
