package br.ucsal;

public class TestaClinica {
    public static void main(String[] args) {

        Enfermeira enfermeira = new Enfermeira(200012108, "Lucianne", 2000, 5000, 7777,
                "Assistente", 40);

        System.out.println(enfermeira.getMatricula() + " " + enfermeira.getNome() + " " +
                enfermeira.getAnoDeAdmissao() + " " + enfermeira.getSalario() + " " +
                enfermeira.getCargaHoraria() + " " + enfermeira.getNumeroDeinscricaoNoCoren() + " "
                + enfermeira.getTipoDeAtuacao());
                

    }
}
