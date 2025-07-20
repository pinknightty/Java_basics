
import java.util.Scanner;


public class Desafio {
        public static void main(String[] args) {
            String nome = "Diana Maravilha";
            String tipoConta = "Conta Corrente";
            double saldo = 1758.85;
            int opcao = 0;
            //double valorSaque = 200.00;

            System.out.println("****************************");
            System.out.println("\nNome do cliente: " + nome);
            System.out.println("Tipo de Conta: " + tipoConta);
            System.out.println("Saldo: R$ " + saldo);
            System.out.println("\n****************************");

            String menu = """
                    *** Digite sua opção ***
                    1 - Consultar Saldo
                    2 - Transferir Valor
                    3 - Receber Valor
                    4 - Sair 
                    """;

                Scanner leitura = new Scanner(System.in);
                while (opcao != 4) {
                    System.out.println(menu);
                    opcao = leitura.nextInt();

                    if (opcao == 1) {
                        System.out.println("Seu saldo é: R$ " + saldo);
                } else if (opcao == 2) {
                        System.out.println("Qual o valor que deseja transferir?");
                        double valor = leitura.nextDouble();
                        
                        if (valor > saldo) {
                            System.out.println("Saldo insuficiente para realizar a transferência.");
                        } else {
                            saldo -= valor;
                            System.out.println("Transferência realizada com sucesso! Seu novo saldo é: R$ " + saldo);
                        }
                } else if (opcao == 3) {
                    System.out.println("Valor recebido: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Valor recebido com sucesso! Seu novo saldo é: R$ " + saldo);
                } else if (opcao != 4) {
                    System.out.println("Opção inválida.");
            }
        } leitura.close();
    } 
}