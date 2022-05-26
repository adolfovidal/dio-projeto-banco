package ProjetoBanco;

import java.util.Random;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 53841;
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        Random random = new Random();
        int numConta = random.nextInt(1000000000);
        this.agencia = AGENCIA_PADRAO;
        this.numero = numConta;
        this.cliente = cliente;
    }

    @Override
    public void debito(double valor) {
        saldo -= valor;

    }

    @Override
    public void credito(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contadDestino) {
        this.debito(valor);
        contadDestino.credito(valor);
    }

    public int getAgencia() {

        return agencia;
    }

    public int getNumero() {

        return numero;
    }

    public double getSaldo() {

        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular da conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero da Conta: %d", this.numero));
        System.out.println(String.format("Saldo disponivel: %.2f", this.saldo));
    }

}

