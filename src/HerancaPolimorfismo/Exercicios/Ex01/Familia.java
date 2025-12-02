package HerancaPolimorfismo.Exercicios.Ex01;

public non-sealed class Familia extends Ingresso {
    public Familia(String nomeDoFilme, double precoUnidade, int qtdIngresso, boolean dublado) {
        super(nomeDoFilme, precoUnidade, qtdIngresso, dublado);
    }

    @Override
    public double valorTotal() {
        if(getQtdIngresso() <= 3){
            return getPrecoUnidade()*getQtdIngresso();
        }else{
            return (getPrecoUnidade()*getQtdIngresso() - (getPrecoUnidade()*getQtdIngresso() * 0.05));
        }
    }
}
