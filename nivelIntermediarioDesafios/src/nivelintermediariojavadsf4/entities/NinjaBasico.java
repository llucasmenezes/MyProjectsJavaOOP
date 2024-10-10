package nivelintermediariojavadsf4.entities;

import nivelintermediariojavadsf4.interfaces.Ninja;

public abstract class NinjaBasico implements Ninja {

    private String nome;
    private int idade;
    private String habilidade;


    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }


    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void mostrarInformacoes() {

    }
    public void executarHabilidade() {

    }



}
