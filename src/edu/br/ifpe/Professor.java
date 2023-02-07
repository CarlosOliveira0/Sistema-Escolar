package edu.br.ifpe;

public class Professor extends Pessoa {
	
	private String disciplina;
	private String siape;

    public Professor(String nome, String email, String cpf,String disciplina, String siape) {
        super(nome, email, cpf);
        this.disciplina = disciplina;
        this.siape = siape;
    }

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

}
