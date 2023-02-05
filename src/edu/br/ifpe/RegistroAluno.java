package edu.br.ifpe;

public class RegistroAluno {
	
	private Aluno aluno;
	private double nota1;
	private double nota2;
	private double media;
	private double recuperacao;
	private double mediaFinal;

	public void RegistroDeAluno(Aluno aluno, double nota1, double nota2, double media, double recuperacao, double mediaFinal) {
	    this.aluno = aluno;
	    this.nota1 = 0;
	    this.nota2 = 0;
	    this.media = 0;
	    this.recuperacao = 0;
	    this.mediaFinal = 0;
	 }

	 public Aluno getAluno() {
	    return aluno;
	 }

	 public void setNota1(double nota1) {
		 this.nota1 = nota1;
		 this.calcularMedia();
	 }
		  
	 public void setNota2(double nota2) {
		  this.nota2 = nota2;
		  this.calcularMedia();
	 }
		  
	 public void setRecuperacao(double recuperacao) {
		   this.recuperacao = recuperacao;
		   this.calcularMediaFinal();
	 }
		  
	 private void calcularMedia() {
		 this.media = (this.nota1 + this.nota2) / 2;
	 }
		  
	 private void calcularMediaFinal() {
		  this.mediaFinal = (this.media + this.recuperacao) / 2;
	 }
		  
	 public double getMedia() {
		  return this.media;
	 }
		  
	 public double getMediaFinal() {
		  return this.mediaFinal;
	 }
 }