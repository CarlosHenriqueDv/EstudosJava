package br.com.estudojava.desafiouri.iniciante;



import java.util.stream.IntStream;

public class URI2753Saida {

    public static void main(String[] args) {

        IntStream.rangeClosed(97, 122).mapToObj(n -> n + " e " + ((char) n)).forEach(System.out::println);


    }
}
