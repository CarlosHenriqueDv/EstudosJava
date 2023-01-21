package br.com.estudojava.desafiouri.iniciante;

import br.com.estudojava.devdojomaratonajava.associacao.classes.Local;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class URI1036FormulaDeBhaskara {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("0.#####", dfs);


        //fórmula de bhaskara -b ± √ b^2-4a.c / 2.a

        double delta;

        try {

            delta = Math.pow(b, 2) - 4 * a * c;

            double raizDeDelta = Math.sqrt(delta);

            double xLinha = (-b + raizDeDelta) / (2 * a);
            double xDuasLinha = (-b - raizDeDelta) / (2 * a);
            if (Double.isNaN(xLinha) || Double.isNaN(xDuasLinha) || Double.isInfinite(xLinha) || Double.isInfinite(xDuasLinha)){
                throw new ArithmeticException("Impossivel calcular");
            }

            System.out.println("R1 = " + decimalFormat.format(xLinha));
            System.out.println("R2 = " + decimalFormat.format(xDuasLinha));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }

}
