package br.com.estudojava.desafiouri.iniciante;

import java.util.Scanner;

public class Cedulas {

    private enum notas{
        CEM(100), CINQUENTA(50), VINTE(20), DEZ(10), CINCO(5),
        DOIS(2), UM(1);
        private int valor;
        notas(int valor) {
            this.valor = valor;
        }
    }



    public static void main(String[] args) {
        //Notas
        //System.out.println("Informe o valor: ");
        Scanner entrada = new Scanner(System.in);

        int notas100, notas50, notas20, notas10,
                notas5, notas2, notas1;

        int valorEntrada = entrada.nextInt();

        float valor = valorEntrada;
        notas100 = (int) (valor / notas.CEM.valor);
        valor %= 100;
        notas50 = (int) (valor / notas.CINQUENTA.valor);
        valor %= 50;
        notas20 = (int) (valor / notas.VINTE.valor);
        valor %= 20;
        notas10 = (int) (valor / notas.DEZ.valor);
        valor %= 10;
        notas5 = (int) (valor / notas.CINCO.valor);
        valor %= 5;
        notas2 = (int) (valor / notas.DOIS.valor);
        valor %= 2;
        notas1 = (int) (valor / notas.UM.valor);
        valor %= 1;
        System.out.println(valorEntrada);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);


    }
}
