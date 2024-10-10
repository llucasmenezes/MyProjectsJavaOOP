package nivelintermediarojavadsf3.entities;

import nivelintermediarojavadsf3.interfaces.HyugaUzumaki;
import nivelintermediarojavadsf3.interfaces.modoSabio;
import nivelintermediarojavadsf3.enums.nivelNinja;

public class Boruto extends Ninja implements HyugaUzumaki, modoSabio {

    public Boruto() {

    }

    public Boruto(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Boruto(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numerosDeMissoesConcluidas, rank);
    }

    public void AtivarOKarma() {
        System.out.println("O Karma foi ativado! eu sou um Hyuga Uzumaki");
    }
    public void AtivarJougan() {
        System.out.println("O Jougan foi ativado! eu sou um Hyuga Uzumaki");
    }

    @Override
    public void AtaqueBasico() {
        System.out.println("Eu sou um ninja e taquei uma konai de Vento");
    }


    public void ModoSabioAtivado()  {
        System.out.println("Meu nome é " + getNome() + " E eu ativei o Modo Sábio!");
    }

    @Override
    public void exibirDetalhes() {
        if (getNumerosDeMissoesConcluidas() > 0)
            System.out.println("Meu nome é " + getNome() + " sou da " + getAldeia() + " tenho " + getIdade() + " anos." + "\n Já realizei: " + getNumerosDeMissoesConcluidas() + " missoes." + " e o meu rank é: " + getRank());
        else {
            System.out.println("Meu nome é " + getNome() + " sou da " + getAldeia() + " tenho " + getIdade() + " anos." + "\n nao realizei nenhuma missao ainda." + " e o meu rank é: " + nivelNinja.CHUUNIN);

        }
    }

}
