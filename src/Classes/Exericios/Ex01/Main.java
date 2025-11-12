package Classes.Exericios.Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("====BEM VINDO AO BANCO A====");
        System.out.println("Digite o seu nome: ");
        String nome = sc.next();
        System.out.println("Digite o seu saldo inicial: ");
        double saldo = sc.nextDouble();

        var account = new Account(nome,saldo);

        while (true){
            System.out.println("===BEM VINDO AO CAIXA ELETRONICO===");
            System.out.println("Escolha a sua ação: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Extrato");
            System.out.println("4 - Pagar um boleto");
            System.out.println("5 - Sair");
            int input = sc.nextInt();

            switch (input){
                case 1:
                    System.out.println("Digite o valor que você deseja Depositar: ");
                    double value = sc.nextDouble();
                    account.deposit(value);
                    break;
                case 2:
                    System.out.println("Digite o valor que você deseja Sacar: ");
                    value = sc.nextDouble();
                    account.withdraw(value);
                    break;
                case 3:
                    System.out.println("===Extrato===");
                    System.out.println("Seu saldo atual é: "+account.getBalance());
                    System.out.println("Seu saldo no cheque especial: "+account.getOverdraftLimit());
                    if(account.verifyOverdraft()){
                        System.out.println("Você já usou o cheque especial");
                    }else{
                        System.out.println("Você ainda não usou o cheque especial");
                    }
                    break;
                case 4:
                    System.out.println("Digite o valor do pagamento");
                    value = sc.nextDouble();
                    account.pay(value);
                    break;
                case 5:
                    System.out.println("Obrigado por usar os nossos serviços");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            if(input == 5){
                break;
            }
            for(int i = 0; i < 10 ; i++){
                System.out.println("");
            }

        }
    }
}
