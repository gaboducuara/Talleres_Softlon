import TipoCuenta.CuentaAhorro;
import TipoCuenta.CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Cuenta de Ahorro
        System.out.print("Ingrese el saldo inicial de la cuenta de ahorro: ");
        double saldoInicialAhorro = scanner.nextDouble();
        CuentaAhorro cuentaDeAhorro = new CuentaAhorro(saldoInicialAhorro);
        // Depósito en Cuenta de Ahorro
        System.out.println("Saldo inicial de la cuenta de ahorro: " + cuentaDeAhorro.saldo);


        System.out.print("Ingrese el monto a depositar en la cuenta de ahorro: ");
        double montoDepositoAhorro = scanner.nextDouble();
        cuentaDeAhorro.depositar(montoDepositoAhorro);
        System.out.println("Saldo después de depositar " + montoDepositoAhorro + ": " + cuentaDeAhorro.saldo);

        // Retiro de Cuenta de Ahorro
        System.out.print("Ingrese el monto a retirar de la cuenta de ahorro: ");
        double montoRetiroAhorro = scanner.nextDouble();
        cuentaDeAhorro.retirar(montoRetiroAhorro);
        System.out.println("Saldo después de retirar " + montoRetiroAhorro + ": " + cuentaDeAhorro.saldo);

        // Cuenta Corriente
        System.out.print("Ingrese el saldo inicial de la cuenta corriente: ");
        double saldoInicialCorriente = scanner.nextDouble();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldoInicialCorriente);
        System.out.println("Saldo inicial de la cuenta corriente: " + cuentaCorriente.saldo);

        // Depósito en Cuenta Corriente
        System.out.print("Ingrese el monto a depositar en la cuenta corriente: ");
        double montoDepositoCorriente = scanner.nextDouble();
        cuentaCorriente.depositar(montoDepositoCorriente);
        System.out.println("Saldo después de depositar " + montoDepositoCorriente + ": " + cuentaCorriente.saldo);

        // Retiro de Cuenta Corriente
        System.out.print("Ingrese el monto a retirar de la cuenta corriente: ");
        double montoRetiroCorriente = scanner.nextDouble();
        cuentaCorriente.retirar(montoRetiroCorriente);
        System.out.println("Saldo después de retirar " + montoRetiroCorriente + ": " + cuentaCorriente.saldo);

        scanner.close();

    }
}