package br.com.estudojava.desafiouri.adhoc;

import java.io.*;
import java.util.Scanner;

public class URI1387Og {

    public static void main(String... args) throws IOException {

        InputStream fis = new FileInputStream("C:\\Users\\cshen\\IdeaProjects\\EstudosJava\\src\\br\\com\\estudojava\\desafiouri\\adhoc\\teste.txt");
        InputStreamReader ir = new InputStreamReader(fis);

        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            String linha = in.readLine();
            if (linha != null && linha.equals("L = R = 0")) {
                break;
            }else if(linha != null){
                int l = Integer.parseInt(linha.substring(0,1));
                int r = Integer.parseInt(linha.substring(2,3));
                int soma = l+r;
                if (soma > 0) {
                    System.out.println(soma);
                }

            }

        }

    }
}
