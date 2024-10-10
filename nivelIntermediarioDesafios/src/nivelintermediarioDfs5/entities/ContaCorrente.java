package nivelintermediarioDfs5.entities;

public class ContaCorrente extends ContaBancaria {


    public void depositar(double valor) {
        double taxa = valor * 0.01;
        saldo += (valor - taxa);
    }
}
