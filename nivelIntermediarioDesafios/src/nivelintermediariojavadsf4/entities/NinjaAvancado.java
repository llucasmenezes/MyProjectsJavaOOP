package nivelintermediariojavadsf4.entities;

import nivelintermediariojavadsf4.interfaces.Ninja;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    public NinjaAvancado(String nome, int idade, String habilidade) {
        super(nome, idade, habilidade);
    }

    public String especialidade;

    public void mostrarInformacoes() {

    }
    public void executarHabilidade() {

    }
}
