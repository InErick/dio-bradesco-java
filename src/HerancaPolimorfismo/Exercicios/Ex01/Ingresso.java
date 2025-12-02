package HerancaPolimorfismo.Exercicios.Ex01;

public sealed abstract class Ingresso permits Normal, MeiaEntrada, Familia{
    private String nomeDoFilme;
    private double precoUnidade;
    private int qtdIngresso;
    private boolean dublado;

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public int getQtdIngresso() {
        return qtdIngresso;
    }

    public boolean isDublado() {
        return dublado;
    }

    public Ingresso(String nomeDoFilme, double precoUnidade, int qtdIngresso, boolean dublado) {
        this.nomeDoFilme = nomeDoFilme;
        this.precoUnidade = precoUnidade;
        this.qtdIngresso = qtdIngresso;
        this.dublado = dublado;
    }

    public abstract double valorTotal();

    @Override
    public String toString() {
        return "Filme escolhido: " +nomeDoFilme
                +"/ Valor do ingresso: "+precoUnidade
                +"/ Quantidade de ingressos: "+qtdIngresso
                +"/ Linguagem do filme: "+(isDublado() ? "Dublado":"Legendado")
                +"/ Valor total: "+valorTotal();
    }
}
