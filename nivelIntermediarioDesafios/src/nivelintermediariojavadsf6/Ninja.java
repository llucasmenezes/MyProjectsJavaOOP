package nivelintermediariojavadsf6;

public  class Ninja {
    protected String nome;
    protected String aldeia;
    protected int idade;

    public Ninja (String nome, String aldeia, int idade) {
        this.nome =nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Vila: " + aldeia;
    }


}
