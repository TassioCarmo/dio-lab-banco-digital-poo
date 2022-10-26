public class Main {

    public static void main(String[] args) {
        Cliente tassio = new Cliente();
        tassio.setNome("Tassio");
        tassio.setCpf("000-000-000-00");

        Conta contaCorrente = new ContaCorrente(tassio);
        Conta contaPoupanca = new ContaPoupanca(tassio);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }

}