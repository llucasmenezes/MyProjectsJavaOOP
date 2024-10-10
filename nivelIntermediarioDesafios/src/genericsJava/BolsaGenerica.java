package genericsJava;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }
    //colocar equipementos Genericos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    @Override
    public String toString() {
        return "bolsa de equipamentos" + equipamentos.toString();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }


    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }
    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = new ArrayList<>();
    }
}


