package Classes.Exericios.Ex01;
//Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
//Consultar saldo x
//consultar cheque especial x
//Depositar dinheiro; x
//Sacar dinheiro; x
//Pagar um boleto. x
//Verificar se a conta está usando cheque especial. x

//Siga as seguintes regras para implementar
//
//A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
//O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
//Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
//Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
//Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
public class Account {

    //Attributes
    private String name;
    private double balance;
    private double overdraftLimit;
    private boolean usingOverdraft;
    //Getters
    public String getName(){
        return this.name;
    }
    public String getBalance(){
        return String.format("%.2f",(this.balance+this.overdraftLimit));
    }
    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }
    public boolean getUsingOverdraft(){
        return this.usingOverdraft;
    }
    //Constructor
    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.overdraftLimit = this.balance < 500 ? 0 : this.balance == 500 ? this.balance * 0.1: this.balance * 0.5 ;
        this.usingOverdraft = false;
    }
    //Methods
    public void deposit (double value){
        this.balance += value;
        System.out.printf("Depósito de R$%s realizado com sucesso!\n",value);
        System.out.printf("O seu saldo atual é de: R$%s\n",balance);
    }
    public void withdraw (double value){
        if(value < balance){
            this.balance -= value;
            System.out.printf("Saque de R$%s realizado com sucesso!\n",value);
            System.out.printf("O seu saldo atual é de: R$%s\n",balance);
        }else{
            System.out.println("Você não tem esse valor");
        }
    }
    public void pay(double value){
        if(value <= balance){
            this.balance -= value;
            System.out.printf("Pagamento de R$%s realizado com sucesso!\n",value);
        }else if(value <= balance + overdraftLimit){
            this.overdraftLimit -= value - balance;
            this.balance = 0;
            System.out.printf("Pagamento de R$%s realizado com sucesso com o cheque especial!\n",value);
            this.usingOverdraft = true;
        }else{
            System.out.println("Você ta sem dinheiro");
        }
    }
    public boolean verifyOverdraft() {
        if (this.usingOverdraft) {
            return true;
        } else {
            return false;
        }
    }
}
