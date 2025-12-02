package Interfaces.ex02;

public class Main {
    public static void main(String[] args) {
        var alimentacao = new Alimentacao(1);
        System.out.println(alimentacao.calculaImposto(100));

        var saudeEBemEstar = new SaudeEBemEstar(1.5);
        System.out.println(saudeEBemEstar.calculaImposto(100));

        var vestuario = new Vestuario(2.5);
        System.out.println(vestuario.calculaImposto(100));

        var cultura = new Cultura(4);
        System.out.println(cultura.calculaImposto(100));
    }
}
