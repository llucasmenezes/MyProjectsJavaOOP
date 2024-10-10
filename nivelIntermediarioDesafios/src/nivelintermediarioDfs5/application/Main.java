package nivelintermediarioDfs5.application;

import nivelintermediarioDfs5.entities.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaCorrente miau = new ContaCorrente();
        miau.depositar(1000);
        System.out.println(miau.consultarSaldo());
    }
}
