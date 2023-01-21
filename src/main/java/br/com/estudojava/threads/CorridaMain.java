package br.com.estudojava.threads;

import java.util.Arrays;
import java.util.List;

/**
 * EstudosJava
 *
 * @author cshen on 28/12/2022.
 */
public class CorridaMain {


    public static void main(String[] args) {

        Corredor c1 = new Corredor("corredor1");
        Corredor c2 = new Corredor("corredor2");

        new Thread(c1).start();
        new Thread(c2).start();

    }

}
