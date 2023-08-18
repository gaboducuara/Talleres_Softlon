package CuentaAbstract;

import BancoCuentas.CuentasBancarias;

public abstract class CuentaAbstracta implements CuentasBancarias {
    public double saldo;
    public CuentaAbstracta() {
    }

    public CuentaAbstracta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar (double monto) {
        this.saldo -= monto;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }
}







