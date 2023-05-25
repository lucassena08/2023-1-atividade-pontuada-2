package br.ucsal;

public abstract class Funcionario {

    protected int matricula;
    protected String nome;
    protected int anoDeAdmissao;
    protected double salario;

    // public Funcionario(int matricula, String nome, double anoDeAdmissao, double salario) {
    //     this.matricula = matricula;
    //     this.nome = nome;
    //     this.anoDeAdmissao = anoDeAdmissao;
    //     this.salario = salario;
    // }

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

    public int getAnoDeAdmissao() {
        return anoDeAdmissao;
    }

    public void setAnoDeAdmissao(int anoDeAdmissao) {
        this.anoDeAdmissao = anoDeAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    

}