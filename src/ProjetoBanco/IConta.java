package ProjetoBanco;


public interface IConta {

    void debito(double valor);
    void credito(double valor);
    void transferir(double valor, IConta contadDestino);

    void imprimirExtrato();
}
