package br.com.estudojava.patterns.builder.exemplo2;

/**
 * EstudosJava
 *
 * @author cshen on 21/01/2023.
 */
public class Personagem {

    private String nome;

    //atributos fisicos
    private int constituicao;
    private int forca;
    private int destreza;
    private int agilidade;

    //atributos mentais
    private int inteligencia;
    private int forcaVontade;
    private int carisma;
    private int percepcao;

    private String classe;

    /*public Personagem(String nome, int constituicao, int forca, int destreza, int agilidade, int inteligencia, int forcaVontade, int carisma, int percepcao, String classe) {
        this.nome = nome;
        this.constituicao = constituicao;
        this.forca = forca;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.forcaVontade = forcaVontade;
        this.carisma = carisma;
        this.percepcao = percepcao;
        this.classe = classe;
    }*/


    public Personagem(PersonagemBuilder builder){
        this.nome = builder.nome;
        this.constituicao = builder.constituicao;
        this.forca = builder.forca;
        this.destreza = builder.destreza;
        this.agilidade = builder.agilidade;
        this.inteligencia = builder.inteligencia;
        this.forcaVontade = builder.forcaVontade;
        this.carisma = builder.carisma;
        this.percepcao = builder.percepcao;
        this.classe = builder.classe;
    }

    public static class PersonagemBuilder {
        private String nome;
        private int constituicao;
        private int forca;
        private int destreza;
        private int agilidade;
        private int inteligencia;
        private int forcaVontade;
        private int carisma;
        private int percepcao;
        private String classe;

        public PersonagemBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public PersonagemBuilder setConstituicao(int constituicao) {
            this.constituicao = constituicao;
            return this;
        }

        public PersonagemBuilder setForca(int forca) {
            this.forca = forca;
            return this;
        }

        public PersonagemBuilder setDestreza(int destreza) {
            this.destreza = destreza;
            return this;
        }

        public PersonagemBuilder setAgilidade(int agilidade) {
            this.agilidade = agilidade;
            return this;
        }

        public PersonagemBuilder setInteligencia(int inteligencia) {
            this.inteligencia = inteligencia;
            return this;
        }

        public PersonagemBuilder setForcaVontade(int forcaVontade) {
            this.forcaVontade = forcaVontade;
            return this;
        }

        public PersonagemBuilder setCarisma(int carisma) {
            this.carisma = carisma;
            return this;
        }

        public PersonagemBuilder setPercepcao(int percepcao) {
            this.percepcao = percepcao;
            return this;
        }

        public PersonagemBuilder setClasse(String classe) {
            this.classe = classe;
            return this;
        }

        public Personagem createPersonagem() {
            return new Personagem(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getForcaVontade() {
        return forcaVontade;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getPercepcao() {
        return percepcao;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return "Personagem = Nome: " + nome + '\n' +
                "Classe= " + classe + "\n" +
                "{Atributos fisicos: " + "forca= " + forca + "; " +
                        "destreza= " + destreza + "; " +
                        "agilizade= " + agilidade + "; " +
                        "forca= " + forca + "; "+
                        "constituicao= " + constituicao + "}";

    }
}
