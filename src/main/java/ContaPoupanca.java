public class ContaPoupanca extends Conta {

    public void debito(double valor) {

        this.saldo = this.saldo - valor;

    }

    public String toString() {
        return "Conta Poupança:\nNúmero: " + Integer.toString(this.agencia) +
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n-------------";
    }
}
