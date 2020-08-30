package br.com.estudojava.devdojomaratonajava.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.5);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
