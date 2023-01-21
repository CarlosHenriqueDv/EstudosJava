package br.com.estudojava.desafiouri.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class URI1040Media3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("0.0", dfs);


        double nota1, nota2, nota3, nota4;

        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        nota4 = scan.nextDouble();
        //pesos 2, 3, 4 e 1
        double mediaPonderada = nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1;
        mediaPonderada = mediaPonderada / (2+3+4+1);

        System.out.println("Media: " + decimalFormat.format(mediaPonderada));

        if (mediaPonderada >= 7.0 ){
            System.out.println("Aluno aprovado.");

        }else if(mediaPonderada < 5.0){
            System.out.println("Aluno reprovado.");

        }else if(mediaPonderada >= 5.0 && mediaPonderada <= 6.9){
            System.out.println("Aluno em exame.");
            double notaRecuperacao = scan.nextDouble();

            System.out.println("Nota do exame: " + decimalFormat.format(notaRecuperacao));
            double mediaFinal = (notaRecuperacao + mediaPonderada) / 2;
            if (mediaFinal >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + decimalFormat.format(mediaFinal));

        }

    }
}
