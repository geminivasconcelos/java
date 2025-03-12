public class Conta {

    String titular;
    double saldo;
    String dataAberturaConta;
    int numero;
    String agencia;

    public Conta(String titular, double saldo, String dataAberturaConta, int numero, String agencia){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.dataAberturaConta = dataAberturaConta;
    }

    public void saca(double valorParaSacar){
    this.saldo -= valorParaSacar;
    }

    public void deposita(double valorDeposito){
        this.saldo += valorDeposito;
    }

    double calculaRendimento(){
        return this.saldo * 0.1;
    }
}
