package br.ucsal;

public class Medico extends Funcionario {
    
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
