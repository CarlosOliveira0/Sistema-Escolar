package edu.br.ifpe;

public class Aluno extends Pessoa {

    private static int contador = 0;
    private String matricula;

    public Aluno(String nome, String email, String cpf) {
        super(nome, email, cpf);
        this.matricula =  "20221Y6-RC" + String.format("%04d", ++contador);
    }

    public String getMatricula() {

        return matricula;
    }
}
