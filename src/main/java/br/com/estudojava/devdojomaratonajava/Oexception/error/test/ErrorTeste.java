package br.com.estudojava.devdojomaratonajava.Oexception.error.test;

public class ErrorTeste {

    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError() {
        stackOverflowError();
    }
}
