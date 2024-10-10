package nivelintermediarioDfs5.entities;


import nivelintermediarioDfs5.interfaces.Conta;

public abstract class ContaBancaria implements Conta {

    protected double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }


    public double consultarSaldo() {
        return saldo;
    }


}
