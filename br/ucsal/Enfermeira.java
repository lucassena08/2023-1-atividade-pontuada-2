package br.ucsal;

public class Enfermeira extends Funcionario {
    
    private int numeroDeinscricaoNoCoren;
    private String tipoDeAtuacao;
    private int cargaHoraria;

    public Enfermeira(int matricula, String nome, int anoDeAdmissao, int salario, int numeroDeinscricaoNoCoren,
            String tipoDeAtuacao, int cargaHoraria) {
        super.matricula = matricula;
        this.nome = nome;
        this.anoDeAdmissao = anoDeAdmissao;
        this.salario = salario;
        this.numeroDeinscricaoNoCoren = numeroDeinscricaoNoCoren;
        this.tipoDeAtuacao = tipoDeAtuacao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getNumeroDeinscricaoNoCoren() {
        return numeroDeinscricaoNoCoren;
    }

    public void setNumeroDeinscricaoNoCoren(int numeroDeinscricaoNoCoren) {
        this.numeroDeinscricaoNoCoren = numeroDeinscricaoNoCoren;
    }

    public String getTipoDeAtuacao() {
        return tipoDeAtuacao;
    }

    public void setTipoDeAtuacao(String tipoDeAtuacao) {
        this.tipoDeAtuacao = tipoDeAtuacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
