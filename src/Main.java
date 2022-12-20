import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        conta.conta = 0001;
        conta.agencia = 2419;
        conta.saldo = 0;

        cliente.nome = "João da Silva";
        cliente.idade = 25;
        cliente.cpf = "07284308788";
        cliente.conta = conta;

        while(true){
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();
            if(escolha == 1){
                System.out.printf("O saldo da conta do %s é R$%.2f\n", cliente.nome, conta.saldo);
            } else if (escolha == 2) {
                System.out.println("Quanto você deseja depositar? ");
                double valorDepositado = scanner.nextDouble();
                conta.saldo += valorDepositado;
                System.out.println("Deposito concluído com sucesso!");
            } else if(escolha == 3){
                System.out.println("Quanto você deseja sacar? ");
                double valorASerSacado = scanner.nextDouble();
                if(valorASerSacado <= conta.saldo) {
                    conta.saldo -= valorASerSacado;
                    System.out.println("Seu saque foi realizado!");
                } else {
                    System.out.println("Saldo insuficiente para saque. ");
                }
            } else if (escolha ==0) {
                System.out.println("Atendimento encerrado");
                break;
            } else {
                System.out.println("Opção digitada é invalida.");
            }
        }
    }
}