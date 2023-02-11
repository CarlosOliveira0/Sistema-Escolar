package edu.br.ifpe;

import java.util.ArrayList;
import java.util.List;

public class Diario {
	
	   private static int contador = 0;
	   private int idTurma;
	   private String nome;
	   private List<RegistroAluno> registrosAlunos;
	   private Professor professor;

	   public Diario(String nome, Professor professor) {
	      this.nome = nome;
	      this.professor = professor;
	      this.idTurma = geraProximoIdTurma();
	      this.registrosAlunos = new ArrayList<>();
	   }

	   private int geraProximoIdTurma() {
	      return ++contador;
	   }

	   public void adicionarRegistroAluno(RegistroAluno registroAluno) {
	      this.registrosAlunos.add(registroAluno);
	   }

	   public List<RegistroAluno> getRegistrosAlunos() {
	      return this.registrosAlunos;
	   }

	   public String getNome() {
	      return this.nome;
	   }

	   public Professor getProfessor() {
	      return this.professor;
	   }

	   public void setProfessor(Professor professor) {
	      this.professor = professor;
	   }

	   public int getIdTurma() {
		   return idTurma;
	   }

	   public void setIdTurma(int idTurma) {
		   this.idTurma = idTurma;
	   }
}