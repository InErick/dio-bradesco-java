package HerancaPolimorfismo.Exercicios.Ex02;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("Atendente","atendente@gmail.com","senha@123");
        Caixa caixa = new Caixa();

        atendente.alterarDados("nome","Erick");
        atendente.alterarDados("email","Erick@gmail.com");
        atendente.alterarDados("senha","Erick123");

        caixa.abrirCaixa();
        caixa.receberPagamento(100);

        Vendedor vendedor = new Vendedor("Lara","Lara@gmail.com","coxinha123");
        vendedor.alterarDados("nome", "Lara");
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        caixa.receberPagamento(444);

        Gerente gerente = new Gerente("Gerente","gerente@gmail.com","senha");
        gerente.gerarRelatorio(caixa, vendedor);
    }
}
