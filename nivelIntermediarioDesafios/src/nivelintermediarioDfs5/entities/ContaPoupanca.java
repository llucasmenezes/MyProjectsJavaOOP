package nivelintermediarioDfs5.entities;

public class ContaPoupanca extends ContaBancaria {



    public void depositar(double valor) {
        double taxa = valor * 0.01;
        saldo += (valor - taxa);
    }
}
