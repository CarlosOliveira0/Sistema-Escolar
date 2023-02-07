package edu.br.ifpe;

public class Teste {

	   public static void main(String[] args) {
	      
	      Pessoa pessoa = new Pessoa("João", "joao@gmail.com", "123.456.789-00");
	      System.out.println("Nome: " + pessoa.getNome());
	      System.out.println("Email: " + pessoa.getEmail());
	      System.out.println("CPF: " + pessoa.getCpf());
	      
	      Aluno aluno = new Aluno("Maria", "maria@gmail.com", "987.654.321-00");
	      System.out.println("\nNome: " + aluno.getNome());
	      System.out.println("Email: " + aluno.getEmail());
	      System.out.println("CPF: " + aluno.getCpf());
	      System.out.println("Matrícula: " + aluno.getMatricula());
	      
	      Professor professor = new Professor("Paulo","paulo@gmail.com", "784.874.984-00", "Programacao Orientada a Objetos", "56789");
	      System.out.println("\nNome: " + professor.getNome());
	      System.out.println("Siape: " + professor.getSiape());
	      System.out.println("CPF: " + professor.getCpf());
	      System.out.println("Disciplina: " + professor.getDisciplina());
	      
	      RegistroAluno registroAluno = new RegistroAluno("José", "jose@gmail.com", "543.675.879-80", 7.5, 8.4, 0);
	      System.out.println("\nNome: " + registroAluno.getNome());
	      System.out.println("Email: " + registroAluno.getEmail());
	      System.out.println("CPF: " + registroAluno.getCpf());
	      System.out.println("Média: " + registroAluno.getMedia());
	      
	     
			/* Bloco com erro a ser corrigido
			 *
			 * Turma turma = new Turma("Programacao Orientada a Objetos", "Paulo" );
			 * System.out.println("\nNome da Turma: " + turma.getNome());
			 * System.out.println("ID da Turma: " + turma.getIdTurma());
			 * System.out.println("Professor da Turma: " + turma.getIdTurma());v
			 * turma.adicionarRegistroAluno(registroAluno);
			 * System.out.println("Registros de Alunos: " +
			 * turma.getRegistrosAlunos().size());
			 */
	   }
	}