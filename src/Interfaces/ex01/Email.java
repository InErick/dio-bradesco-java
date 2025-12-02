package Interfaces.ex01;

public class Email implements EnvioDeMensagem{
    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Mensagem de Email foi enviada com sucesso!");
        System.out.println("A mensagem enviada foi: "+msg);
    }
}
