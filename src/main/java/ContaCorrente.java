public class ContaCorrente extends Conta {

    public void debito(double valor) {

        double cpmf = valor * 0.38 / 100;

        this.saldo = this.saldo - valor - cpmf;

    }



    public String toString() {
        return "Conta Corrente:\nNúmero: " + Integer.toString(this.agencia) +
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n-------------\n";
    }

}
