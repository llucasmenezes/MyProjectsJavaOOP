package nivelintermediarojavadsf3.application;

import nivelintermediarojavadsf3.entities.*;
import nivelintermediarojavadsf3.enums.nivelNinja;

public class Main {
    public static void main(String[] args) {


        // construtor noArgs
        //objeto1
        Uchiha Sasuke = new Uchiha();
        Sasuke.setNome("Sasuke Uchiha");
        Sasuke.getNome();
        Sasuke.setAldeia("Aldeia da Folha");
        Sasuke.setIdade(18);

        // construtor allArgs
        //objeto2
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17);



        // construtor allArgs
        //Objeto3
        Haruno Sakura = new Haruno("Sakura", "Aldeia da Folha", 18);


        // construtor allArgs
        //Objeto4
        Hyuuga Hinata = new Hyuuga("Hinata hyuuga", "Aldeia da Folha", 17);

        // construtor allArgs
        //objt5
        Boruto Boruto = new Boruto("Boruto Uzumaki", "Aldeia da Folha", 10);
        Boruto.exibirDetalhes();

        //utilizando o novo construtor que sobrecarreguei!
        Hatake kakashi = new Hatake("kakashi", "Aldeia da folha", 40, 749, nivelNinja.JOUNNIN);
        kakashi.exibirDetalhes();






    }
}
