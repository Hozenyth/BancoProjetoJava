public class Aplicacao {
    public static void main(String[] args) {

        // Instancia o cliente
        Cliente cliente1 = new Cliente("Alexandre", "93580843087");

        // Instancia uma conta do tipo corrente
        ContaCorrente corrente1 = new ContaCorrente();

        // Cria a conta
        corrente1.criarConta(cliente1, 0);

        // Imprime o objeto corrente após criado a conta
        System.out.println(corrente1);
/*
        // realiza um depósito de 500
        corrente1.credito(500);

        // Imprime o objeto corrente após depósito
        System.out.println(corrente1);

        // Realiza um débito de 100
        corrente1.debito(100);

        // Imprime o objeto corrente após saque
        System.out.println(corrente1);

        // Instancia uma conta do tipo poupanca
        ContaPoupanca poupanca1 = new ContaPoupanca();

        // Imprime a conta poupanca
        System.out.println(poupanca1);

        // Cria a conta poupanca
        poupanca1.criarConta(cliente1, 0);

        // Imprime a conta poupanca
        System.out.println(poupanca1);

        // realiza um deposito de 500
        poupanca1.credito(500);

        // Imprime a conta poupanca
        System.out.println(poupanca1);

        // realiza um debito de 100
        poupanca1.debito(100);

        // Imprime a conta poupanca
        System.out.println(poupanca1);

        // transferencia de poupanca para corrente
        poupanca1.transferirParaConta(100, corrente1);

        // Imprime as duas contas
        System.out.println(corrente1);
        System.out.println(poupanca1);

        // Transferir de corrente para poupança
        corrente1.transferirParaConta(100, poupanca1);

        // Imprime as duas contas
        System.out.println(corrente1);
        System.out.println(poupanca1);

 */
    }
}
