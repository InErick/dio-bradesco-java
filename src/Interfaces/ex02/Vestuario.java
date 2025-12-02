package Interfaces.ex02;

public class Vestuario implements Imposto{

    private final double taxa;

    public Vestuario(double taxa){
        this.taxa = taxa/100;
    }

    @Override
    public double calculaImposto(double valor) {
        return valor*this.taxa ;
    }
}
