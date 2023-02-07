package edu.br.ifpe;

public class Aluno extends Pessoa {

    private static int contador = 0;

    public Aluno(String nome) {
        super(nome, "20221Y6-RC" + String.format("%04d", ++contador));
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }
}