package HerancaPolimorfismo.Exercicios.Ex02;

public class Caixa {
    private double valorEmCaixa= 1000;
    private boolean statusCaixa;
    private double totalEmVendas;

    public double getTotalEmVendas() {
        return totalEmVendas;
    }

    public boolean isStatusCaixa() {
        return statusCaixa;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor){
        if(statusCaixa){
            System.out.println("Pagamento realizado com sucesso");
            this.valorEmCaixa += valor;
            this.totalEmVendas += valor;
        }else{
            System.out.println("Erro... Caixa fechado");
        }
    }

    public void abrirCaixa(){
        System.out.println("Caixa aberto com sucesso!");
        this.statusCaixa = true;
    }

    public void fecharCaixa(){
        System.out.println("Caixa fechado com sucesso!");
        this.statusCaixa = false;
    }
}
