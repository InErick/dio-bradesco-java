package HerancaPolimorfismo.Exercicios.Ex02;

public non-sealed class Vendedor extends Usuarios {
    private int qtdVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void realizarVenda(){
        System.out.println("Venda realizada com sucesso do vendedor(a) "+nome);
        this.qtdVendas++;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }
}
