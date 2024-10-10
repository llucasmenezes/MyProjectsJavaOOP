package nivelintermediariojavadsf6;

/*
1. list de ninjas usando linkedList ok
2. cada ninja terá nome, idade e vila ok
3. inicialmente, 7 ninjas serão adicionados
4. metodo pra remover o primeiro ninja ok
5. metodo adicionar um novo ninja no inicio ok
6. metodo exibir  lista completa ok
7.

*/

public class Main {

    public static void main(String[] args) {

        NinjaList lista = new NinjaList();
        lista.adicionarNinjasIniciais();
        lista.mostrarNinjas();
        System.out.println("---------------------------------------");
        lista.removerPrimeiroNinja();
        lista.adicionarNinjaPush(new Ninja("Rock Lee", "Aldeia da folha", 17));
        System.out.println(lista);
    }
}
