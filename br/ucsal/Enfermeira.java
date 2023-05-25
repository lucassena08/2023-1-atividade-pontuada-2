package br.ucsal;

public class Enfermeira {
    private int matricula;
    private String nome;
    private int anoDeAdmissao;
    private int salario;
    private int numeroDeinscricaoNoCoren;
    private String tipoDeAtuacao;
    private int cargaHoraria;

    public Enfermeira(int matricula, String nome, int anoDeAdmissao, int salario, int numeroDeinscricaoNoCoren,
            String tipoDeAtuacao, int cargaHoraria) {
        this.matricula = matricula;
        this.nome = nome;
        this.anoDeAdmissao = anoDeAdmissao;
        this.salario = salario;
        this.numeroDeinscricaoNoCoren = numeroDeinscricaoNoCoren;
        this.tipoDeAtuacao = tipoDeAtuacao;
        this.cargaHoraria = cargaHoraria;
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

    public int getAnoDeAdmissao() {
        return anoDeAdmissao;
    }

    public void setAnoDeAdmissao(int anoDeAdmissao) {
        this.anoDeAdmissao = anoDeAdmissao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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
