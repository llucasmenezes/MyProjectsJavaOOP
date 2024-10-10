package nivelintermediarojavadsf3.entities;

import nivelintermediarojavadsf3.enums.nivelNinja;

public class Haruno extends Ninja {


    public Haruno() {
    }

    public Haruno(String nome, String aldeia,  int idade) {
        super(nome, aldeia, idade);

    }

    public Haruno(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numerosDeMissoesConcluidas, rank);
    }

    public void AtivarCura() {
        System.out.println("Eu sou " + getNome() + " E eu ativei a minha cura fora do comum!");
    }

    @Override
    public void AtaqueBasico() {
        System.out.println("Eu sou um ninja e taquei uma konai");
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
