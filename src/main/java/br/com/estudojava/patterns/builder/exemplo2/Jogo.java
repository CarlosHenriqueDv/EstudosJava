package br.com.estudojava.patterns.builder.exemplo2;

/**
 * EstudosJava
 *
 * @author cshen on 21/01/2023.
 */
public class Jogo {

    public static void main(String[] args) {

        Personagem p1 = new Personagem.PersonagemBuilder()
                .setNome("Natsu")
                .setConstituicao(50)
                .setForca(100)
                .setDestreza(150)
                .setAgilidade(250)
                .setInteligencia(30)
                .setForcaVontade(600)
                .setCarisma(140)
                .setPercepcao(30)
                .setClasse("Barbaro")
                .createPersonagem();

        System.out.println(p1);




    }
}
