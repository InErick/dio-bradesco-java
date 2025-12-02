package Interfaces.ex02;

public class SaudeEBemEstar implements Imposto{

    private final double taxa;

    public SaudeEBemEstar(double taxa){
        this.taxa = taxa/100;
    }

    @Override
    public double calculaImposto(double valor) {
        return valor*this.taxa ;
    }
}
