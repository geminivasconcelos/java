import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Bem vindo a calculadora! Escolha a operação: \n");

        System.out.printf("1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão\n");

        Scanner itemDigitadoUsuario = new Scanner(System.in);

        String operacaoDigitada;
        operacaoDigitada = itemDigitadoUsuario.next();
        System.out.print("Digite o primeiro número: ");
        int primeiroNumeroDigitado;
        primeiroNumeroDigitado = itemDigitadoUsuario.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumeroDigitado;
        segundoNumeroDigitado = itemDigitadoUsuario.nextInt();
        int resultado = 0;
        switch (operacaoDigitada){
            case "1":
                resultado = primeiroNumeroDigitado + segundoNumeroDigitado;
                System.out.print("Resultado da soma é: " +resultado);
                break;
            case "2":
                resultado = primeiroNumeroDigitado - segundoNumeroDigitado;
                System.out.println("Resultado da subtração é: " + resultado);
                break;
            case "3":
                resultado = primeiroNumeroDigitado * segundoNumeroDigitado;
                System.out.println("Resultado da multiplicação é: " +resultado);
                break;
            case "4":
                resultado = primeiroNumeroDigitado / segundoNumeroDigitado;
                System.out.println("Resultado da divisão é: " +resultado);
                break;
            default:
                System.out.println("Encerrando!");
                break;
        }
    }
}