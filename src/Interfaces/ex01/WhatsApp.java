package Interfaces.ex01;

public class WhatsApp implements EnvioDeMensagem{
    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Mensagem de Whatsapp enviada com sucesso!");
        System.out.println("A mensagem enviada foi: "+msg);
    }
}
