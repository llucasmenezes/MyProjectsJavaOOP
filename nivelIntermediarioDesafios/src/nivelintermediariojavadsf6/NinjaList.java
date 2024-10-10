package nivelintermediariojavadsf6;

import java.util.LinkedList;

public class NinjaList<T> {
    protected LinkedList<Ninja> ninjas = new LinkedList<>();


    public void adicionarNinjasIniciais() {
        ninjas.add(new Ninja("sasuke", "aldeia da folha", 18));
        ninjas.add(new Ninja("Hinata", "Aldeia da folha", 17));
        ninjas.add(new Ninja("Naruto", "Aldeia da folha", 18));
        ninjas.add(new Ninja("kakashi", "Aldeia da folha", 18));
        ninjas.add(new Ninja("Sakura", "Aldeia da folha", 18));
        ninjas.add(new Ninja("tenten", "Aldeia da folha", 18));
        ninjas.add(new Ninja("Neji", "Aldeia da folha", 18));
    }


    //metodo de adicionar ninja em primeiro lugar
    public void adicionarNinjaPush(Ninja ninja){
        ninjas.addFirst(ninja);
    }

    //metodo para remover o primeiro ninja
    public void removerPrimeiroNinja(){
        if(!ninjas.isEmpty()) {
            ninjas.removeFirst();
        }
    }

    //metodo para exibir os ninjas

    public void mostrarNinjas() {
        for (Ninja ninja : ninjas) {
            System.out.println("Nome: " + ninja.nome + ", Idade: " + ninja.idade + ", Vila: " + ninja.aldeia);
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ninja ninja : ninjas) {
            sb.append("Nome: " + ninja.nome + ", Idade: " + ninja.idade + ", Vila: " + ninja.aldeia + "\n");
        }
        return sb.toString();
    }
}
