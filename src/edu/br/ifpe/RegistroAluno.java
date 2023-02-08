package edu.br.ifpe;

public class RegistroAluno extends Aluno {
	
	private double nota1;
	private double nota2;
	private double media;

	public RegistroAluno(String nome,String email, String cpf, double nota1, double nota2) {
	   
		super(nome, email, cpf);
	    this.nota1 = nota1;
	    this.nota2 = nota2;
	    this.media = (nota1 + nota2) / 2;;
	 }

	public double getNota2() {
		return nota2;
	}
	
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	
	public double getNota1() {
		return nota1;
	}
	
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
 
	 public double getMedia() {

		return this.media;
	 }


	 @Override
	 public String getMatricula() {
		return super.getMatricula();
	 }


	 
}
