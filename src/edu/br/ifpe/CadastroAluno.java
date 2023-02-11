package edu.br.ifpe;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAluno {

	public static void main(String[] args) {

		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe os dados do aluno, ou digite 0 para Finalizar :");
		String nome = " ";		

		while (nome.compareTo("0") != 0) {
			
			System.out.print("Nome completo: ");
			nome = scanner.next();

			if (nome.compareTo("0") != 0) {

				System.out.print("Email: ");
				String email = scanner.next();

				System.out.print("CPF: ");
				String cpf = scanner.next();

				System.out.print("Ano: ");
				int ano = scanner.nextInt();

				System.out.print("Entrada: ");
				int entrada = scanner.nextInt();

				Aluno aluno = new Aluno(nome, email, cpf, ano, entrada);
				listaAlunos.add(aluno);

				System.out.printf("Aluno cadastrado com sucesso!%n%n%n");

			}			
		}
		
	    System.out.println("\nAlunos Cadastrados:");

	    for (int counter = 0; counter < listaAlunos.size(); counter++) {
		    System.out.printf("%nNome: %s%nEmail: %s %nCPF: %s %nMatricula: %s %nAno: %4d %nEntrada: %d %n-----------------",
		    		listaAlunos.get(counter).getNome(),
		    		listaAlunos.get(counter).getEmail(),
		    		listaAlunos.get(counter).getCpf(),
		    		listaAlunos.get(counter).getMatricula(),
		    		listaAlunos.get(counter).getAno(),
		    		listaAlunos.get(counter).getEntrada());
	    }

	    System.out.println("\nSaida CSV no formato ;Nome;email;cpf;Matricula;Ano;Entrada;");

	    for (int counter = 0; counter < listaAlunos.size(); counter++) {
		    System.out.printf("%n;%s;%s;%s;%s;%4d;%d;",
		    		listaAlunos.get(counter).getNome(),
		    		listaAlunos.get(counter).getEmail(),
		    		listaAlunos.get(counter).getCpf(),
		    		listaAlunos.get(counter).getMatricula(),
		    		listaAlunos.get(counter).getAno(),
		    		listaAlunos.get(counter).getEntrada());
	    }

	    scanner.close();
	}
}
