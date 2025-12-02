package HerancaPolimorfismo.Exercicios.Ex01;

public non-sealed class MeiaEntrada extends Ingresso {
    public MeiaEntrada(String nomeDoFilme, double precoUnidade, int qtdIngresso, boolean dublado) {
        super(nomeDoFilme, precoUnidade, qtdIngresso, dublado);
    }

    @Override
    public double valorTotal() {
        return (getPrecoUnidade()*getQtdIngresso())/2;
    }
}
