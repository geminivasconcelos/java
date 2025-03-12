//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Conta conta = new Conta("Colossal", 54.344, "11/03/2025", 33469, "4523-69");

       System.out.println("Olá, "+conta.titular + "!");
       System.out.println("Qual operação deseja fazer? \n1 - Consultar saldo \n2 - Sacar dinheiro \n3 - Depositar");
    }
}