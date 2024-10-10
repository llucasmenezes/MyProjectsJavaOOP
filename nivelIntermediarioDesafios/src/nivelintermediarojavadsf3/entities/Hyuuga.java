package nivelintermediarojavadsf3.entities;

import nivelintermediarojavadsf3.enums.nivelNinja;

public class Hyuuga extends Ninja {

    public Hyuuga() {
    }

    public Hyuuga(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hyuuga(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numerosDeMissoesConcluidas, rank);
    }

    @Override
    public void AtaqueBasico() {
        System.out.println("Eu sou um ninja e taquei uma shuriken");
    }

    public void VisaoRaiox() {
        System.out.println("Eu sou a " + getNome() + " E eu ativei o Byakugan");
    }

    @Override
    public void exibirDetalhes() {
        if (getNumerosDeMissoesConcluidas() > 0)
            System.out.println("Meu nome é " + getNome() + " sou da " + getAldeia() + " tenho " + getIdade() + " anos." + "\n Já realizei: " + getNumerosDeMissoesConcluidas() + " missoes." + " e o meu rank é: " + getRank());
        else {
            System.out.println("Meu nome é " + getNome() + " sou da " + getAldeia() + " tenho " + getIdade() + " anos." + "\n nao realizei nenhuma missao ainda." + " e o meu rank é: " + getRank());

        }
    }

}
