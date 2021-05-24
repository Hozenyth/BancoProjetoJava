import java.util.Scanner;

public abstract class  Conta {
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;


    public Conta() {
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0;
        this.cliente = null;
    }

    public void criarConta(Cliente cliente, double saldoInicial) {
        Scanner scanner = new Scanner(System.in);
        int numConta = scanner.nextInt(1000000);
        int numAgencia = scanner.nextInt(1000);
        this.cliente = cliente;
        this.numero = numConta;
        this.agencia = numAgencia;
        this.saldo = saldoInicial;
    }

    public void credito(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void transferirParaConta(double valor, Conta conta){

        this.debito(valor);
        conta.credito(valor);

    }

    public abstract void debito(double valor);

}
