package Interfaces.ex02;

public class Alimentacao implements Imposto{

    private final double taxa;

    public Alimentacao(double taxa){
        this.taxa = taxa/100;
    }

    @Override
    public double calculaImposto(double valor) {
        return valor*this.taxa ;
    }
}
