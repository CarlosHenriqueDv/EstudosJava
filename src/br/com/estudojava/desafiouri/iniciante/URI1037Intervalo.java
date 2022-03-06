package br.com.estudojava.desafiouri.iniciante;

import java.io.*;
import java.util.Scanner;
public class URI1037Intervalo {

    public static void main(String... args) throws IOException {

//        Scanner in = new Scanner(System.in);
//
//        double entrada = in.nextDouble();

        InputStream inputStream = new FileInputStream("C:\\Users\\cshen\\IdeaProjects\\EstudosJava\\src\\br\\com\\estudojava\\desafiouri\\iniciante\\arquivosteste\\URI1037Intervalo.txt");
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);
        while (bf.ready()) {
            double entrada = Double.parseDouble(bf.readLine());

            if (entrada >= 0D && entrada <= 25.00) {
                System.out.println("Intervalo [0,25]");
            } else if (entrada >= 25.00 && entrada <= 50.00) {
                System.out.println("Intervalo (25,50]");
            } else if (entrada > 50.00 && entrada <= 75.00) {
                System.out.println("Intervalo (50,75]");
            } else if (entrada > 75.00 && entrada <= 100) {
                System.out.println("Intervalo (75,100]");
            } else {
                System.out.println("Fora de intervalo");
            }
        }

    }
}
