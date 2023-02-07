package edu.br.ifpe;

public class Professor extends Pessoa {
	private String disciplina;

    public Professor(String nome, String matricula, String disciplina) {
        super(nome, matricula);
        this.disciplina = disciplina;
    }

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}