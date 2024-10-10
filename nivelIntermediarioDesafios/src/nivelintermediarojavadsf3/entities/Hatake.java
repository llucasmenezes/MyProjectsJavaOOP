package nivelintermediarojavadsf3.entities;

import nivelintermediarojavadsf3.interfaces.anbu;
import nivelintermediarojavadsf3.enums.nivelNinja;
import nivelintermediarojavadsf3.interfaces.sharinga;

public class Hatake extends Ninja implements sharinga, anbu {

    public Hatake() {

    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numerosDeMissoesConcluidas, rank);
    }

    public void SharingaAtivado() {
        System.out.println("Meu nome é " + getNome() + " O Sharingan Ativou, eu sou um hatake!");
    }

    public void ninjaDeElite() {
        System.out.println("Eu sou um ninja de elite!");
    }

    @Override
    public void AtaqueBasico() {
        System.out.println("Eu sou um ninja e taquei uma konai de Vento");
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
