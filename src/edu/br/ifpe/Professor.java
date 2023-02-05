package edu.br.ifpe;

public class Professor extends Pessoa {
    private String siape;

    public Professor(int id, String nome, int idade, String endereco, String siape) {
        super(id, nome, idade, endereco);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}