package edu.br.ifpe;

import java.util.HashMap;
import java.util.Map;

public class RegistroAluno extends Aluno {
	
	private double nota1;
	private double nota2;
	private double media;
	private Map<String, Integer> faltas;

	public RegistroAluno(String nome,String email, String cpf, int ano, int entrada, double nota1, double nota2) {
	   
		super(nome, email, cpf, ano, entrada);
	    this.nota1 = nota1;
	    this.nota2 = nota2;
	    this.media = (nota1 + nota2) / 2;
	    this.faltas = new HashMap<>();
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
	 
	 public void registrarFaltas(String matriculaAluno, int faltas) {
		    int faltasAnteriores = this.faltas.getOrDefault(matriculaAluno, 0);
		    this.faltas.put(matriculaAluno, faltasAnteriores + faltas);
		}

		public int getFaltas(String matriculaAluno) {
		    return this.faltas.getOrDefault(matriculaAluno, 0);
		}


	 @Override
	 public String getMatricula() {
		return super.getMatricula();
	}
}