public class Cuenta {
    private double saldo;
    private int numeroCuenta;

    public Cuenta(double saldoInicial, int numeroCuenta) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}

