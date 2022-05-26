package ProjetoBanco;

public class Main {
    public static void main(String[] args) {

        Cliente novoCliente0001 = new Cliente();
        novoCliente0001.setNome("Paula Vidal");

        Cliente novoCliente0002 = new Cliente();
        novoCliente0002.setNome("Adolfo Vidal");

        Conta cc = new ContaCorrente(novoCliente0001);
        cc.credito(1000);

        Conta poupanca = new ContaPoupança(novoCliente0002);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}


