package HerancaPolimorfismo.Exercicios.Ex02;

public non-sealed class Gerente extends Usuarios {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.administradr = true;
    }

    public void gerarRelatorio(Caixa caixa, Vendedor vendedor){
        System.out.println("Relatório de vendas");
        System.out.println("Vendas realizadas : "+vendedor.getQtdVendas());
        System.out.println("Total em vendas: "+caixa.getTotalEmVendas());
    }
}
