package Interfaces.ex01;

public class SMS implements EnvioDeMensagem {

    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Mensagem de sms foi enviada com sucesso!");
        System.out.println("A mensagem enviada foi: "+msg);
    }
}
