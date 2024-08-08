package Conta.src;

import java.util.Scanner;
public class ContaTerminal {
    public int NumeroConta;
    public String Agencia;
    public String NomeCliente;
    public Float Saldo;

    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner input = new Scanner(System.in);
        conta.PegarDados(input);
    }

    public void PegarDados(Scanner input){
        
        System.out.println("Por favor, digite o seu nome: ");
        NomeCliente = input.nextLine();
        
        System.out.println("Por favor, digite o número da sua agência: ");
        Agencia = input.nextLine();

        System.out.println("Por favor, digite o número da sua conta: ");
        NumeroConta = input.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        Saldo = input.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco. A sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo (" + Saldo + ") já está disponível para saque.");
    }
}
