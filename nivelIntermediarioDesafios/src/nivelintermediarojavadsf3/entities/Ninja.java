package nivelintermediarojavadsf3.entities;

import nivelintermediarojavadsf3.enums.nivelNinja;

public abstract class Ninja {

   private String nome;
   private String aldeia;
   private int idade;
   private int numerosDeMissoesConcluidas;
   private nivelNinja rank;



    //construtor vazio == noArgs
    public Ninja() {

    }
    //primeiro metodo/construtor! == allArgs
   public Ninja(String nome, String aldeia, int idade) {
       this.nome = nome;
       this.aldeia = aldeia;
       this.idade = idade;
   }

   //sobrecarga do construtor, chamando os novos atributos
   public Ninja(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, nivelNinja rank) {
        this(nome, aldeia, idade);
        this.numerosDeMissoesConcluidas = numerosDeMissoesConcluidas;
        this.rank = rank;
   }


    // getters e setters (encapsulamento)
    public String getNome() {
        return nome;
    }  public void setNome(String nome) {
         this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }  public void setIdade(int idade) {
         this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }  public void setAldeia(String aldeia) {
         this.aldeia = aldeia;
    }

    public void setNumerosDeMissoesConcluidas(int numerosDeMissoesConcluidas) {
        this.numerosDeMissoesConcluidas = numerosDeMissoesConcluidas;
    }

    public int getNumerosDeMissoesConcluidas() {
        return numerosDeMissoesConcluidas;
    }

    public void setRank(nivelNinja rank) {
        this.rank = rank;
    }


    public nivelNinja getRank() {
        return rank;
    }

    public abstract void AtaqueBasico();


    public void exibirDetalhes() {
        if (numerosDeMissoesConcluidas > 0)
            System.out.println("Meu nome é " + getNome() + " sou da " + getAldeia() + " tenho " + getIdade() + " anos." + "\n Já realizei: " + getNumerosDeMissoesConcluidas() + " missoes." + " e o meu rank é: " + getRank());
        else {
            System.out.println("Meu nome é " + getNome() + " sou da " + getAldeia() + " tenho " + getIdade() + " anos." + "\n nao realizei nenhuma missao ainda." + " e o meu rank é: " + getRank());

        }
    }
}
