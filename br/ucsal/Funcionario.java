package br.ucsal;

public class Funcionario {

    private int matricula;
    private String nome;
    private double anoDeAdmissao;
    private double salario;

    public Funcionario(int matricula, String nome, double anoDeAdmissao, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.anoDeAdmissao = anoDeAdmissao;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAnoDeAdmissao() {
        return anoDeAdmissao;
    }

    public void setAnoDeAdmissao(double anoDeAdmissao) {
        this.anoDeAdmissao = anoDeAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

}