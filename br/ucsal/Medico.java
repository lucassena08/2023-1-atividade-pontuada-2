package br.ucsal;

public class Medico {
    
    private int matricula;
    private String nome;
    private int anoDeAdmissao;
    private double salario;
    private int crm;
    private String nomesDasEspecialidades;
    
    public Medico(int matricula, String nome, int anoDeAdmissao, double salario, int crm,
            String nomesDasEspecialidades) {
        this.matricula = matricula;
        this.nome = nome;
        this.anoDeAdmissao = anoDeAdmissao;
        this.salario = salario;
        this.crm = crm;
        this.nomesDasEspecialidades = nomesDasEspecialidades;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNomesDasEspecialidades() {
        return nomesDasEspecialidades;
    }

    public void setNomesDasEspecialidades(String nomesDasEspecialidades) {
        this.nomesDasEspecialidades = nomesDasEspecialidades;
    }

    

    

}
