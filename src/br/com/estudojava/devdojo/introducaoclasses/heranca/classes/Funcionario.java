package br.com.estudojava.devdojo.introducaoclasses.heranca.classes;

public class Funcionario extends Pessoa {
    
    private double salario;



    public void imprime (){
        super.imprime();
        System.out.println("Salário: " + this.salario);
        
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu: " + super.nome + " recebi o pagamento de " + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
