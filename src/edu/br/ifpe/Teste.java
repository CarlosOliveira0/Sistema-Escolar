package edu.br.ifpe;

public class Teste {

	   public static void main(String[] args) {
		   
	      //Testa classe Pessoa
	      Pessoa pessoa = new Pessoa("João", "joao@gmail.com", "123.456.789-00");
	      System.out.println("Nome: " + pessoa.getNome());
	      System.out.println("Email: " + pessoa.getEmail());
	      System.out.println("CPF: " + pessoa.getCpf());
	       
	      //Testa classe Aluno
	      Aluno aluno = new Aluno("Maria", "maria@gmail.com", "987.654.321-00", 2021, 1);
	      System.out.println("\nNome: " + aluno.getNome());
	      System.out.println("Email: " + aluno.getEmail()); 
	      System.out.println("CPF: " + aluno.getCpf()); 
	      System.out.println("Matrícula: " + aluno.getMatricula());
	      
	      //Testa classe Professor
	      Professor professor = new Professor("Paulo","paulo@gmail.com", "784.874.984-00", "Programacao Orientada a Objetos", "56789");
	      System.out.println("\nNome: " + professor.getNome());
	      System.out.println("Siape: " + professor.getSiape());
	      System.out.println("CPF: " + professor.getCpf());
	      System.out.println("Disciplina: " + professor.getDisciplina());
	      
	      //Testa classe Registro
	      RegistroAluno registroAluno = new RegistroAluno("José", "jose@gmail.com", "543.675.879-80", 2021, 2, 7.5, 8.4);
	      System.out.println("\nNome: " + registroAluno.getNome());
	      System.out.println("Email: " + registroAluno.getEmail());
	      System.out.println("CPF: " + registroAluno.getCpf());
	      System.out.println("Média: " + registroAluno.getMedia());
	      System.out.println("Matrícula: " + registroAluno.getMatricula());
	       
	      RegistroAluno registroAluno2 = new RegistroAluno("Carlos", "Carlos@gmail.com", "543.675.879-80", 2022, 1, 9.0, 8.0);
	      System.out.println("\nNome: " + registroAluno2.getNome());
	      System.out.println("Email: " + registroAluno2.getEmail());
	      System.out.println("CPF: " + registroAluno2.getCpf());
	      System.out.println("Média: " + registroAluno2.getMedia());
	      System.out.println("Matrícula: " + registroAluno2.getMatricula());
	      
	      RegistroAluno registroAluno3 = new RegistroAluno("Alane", "Alane@gmail.com", "543.675.879-80", 2021, 1, 8.5, 9.7);
	      System.out.println("\nNome: " + registroAluno3.getNome());
	      System.out.println("Email: " + registroAluno3.getEmail());
	      System.out.println("CPF: " + registroAluno3.getCpf());
	      System.out.println("Média: " + registroAluno3.getMedia());
	      System.out.println("Matrícula: " + registroAluno3.getMatricula());
	      
	      //Testa classe Diario
	      Diario turma = new Diario("Programacao Orientada a Objetos", professor );
	      System.out.println("\nNome da Turma: " + turma.getNome());
	      System.out.println("ID da Turma: " + turma.getIdTurma());
	      System.out.println("Professor da Turma: " + professor.getNome());
	      turma.adicionarRegistroAluno(registroAluno);
	      turma.adicionarRegistroAluno(registroAluno2);
	      turma.adicionarRegistroAluno(registroAluno3);
	      System.out.println("Registros de Alunos: " + turma.getRegistrosAlunos().size());
	
	      
	      //Gerando saída no formato CSV
	      System.out.println("\nSaida CSV no formato: Aluno;Email;CPF;Media;Matricula");

	      for (int counter = 0; counter < turma.getRegistrosAlunos().size(); counter++) {
		      System.out.printf("%n;%s;%s;%s;%.2f;%s", 
		    		  			turma.getRegistrosAlunos().get(counter).getNome(), 
		    		  			turma.getRegistrosAlunos().get(counter).getEmail(),
		    		  			turma.getRegistrosAlunos().get(counter).getCpf(), 
		    		  			turma.getRegistrosAlunos().get(counter).getMedia(),
		    		  			turma.getRegistrosAlunos().get(counter).getMatricula());
		    		

	      }
	   }
	}