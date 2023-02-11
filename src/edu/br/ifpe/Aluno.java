package edu.br.ifpe;

public class Aluno extends Pessoa {

    private static int contador = 0;
    private String matricula;
    private int ano;
    private int entrada;

    public Aluno(String nome, String email, String cpf, int ano, int entrada) {
        super(nome, email, cpf);
        this.ano = ano;
        this.entrada = entrada;
        this.matricula =  String.format("%04d", ano)+String.format("%d", entrada)+"Y6-RC" + String.format("%04d", ++contador);
    }

    public String getMatricula() {

        return matricula;
    }
    
    public void setAno (int ano) {
    	this.ano = ano;
    	
    }
    
    public void setEntrada (int entrada) {
    	this.entrada = entrada;
    	
    }
    
    public int getAno () {
    	return ano;
    	
    }
    
    public int getEntrada () {
    	return entrada;
    }
}

