package edu.br.ifpe;

public class Aluno extends Pessoa {
	private int matricula;

	public Aluno(int id, String nome, int matricula, int idade, String endereco) {
		super(id, nome, idade, endereco);
	    this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}
}