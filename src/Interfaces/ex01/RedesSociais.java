package Interfaces.ex01;

public class RedesSociais implements EnvioDeMensagem{
    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Mensagem de Redes Sociais foi enviada com sucesso!");
        System.out.println("A mensagem enviada foi: "+msg);
    }
}
