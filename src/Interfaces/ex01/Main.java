package Interfaces.ex01;

public class Main {
    public static void main(String[] args) {
        var email = new Email();
        var redes = new RedesSociais();
        var sms = new SMS();
        var wpp = new WhatsApp();

        email.enviarMensagem("Oi, você consegue me responder aqui no "+email.getClass());
        System.out.println("------------------------------------------------");
        redes.enviarMensagem("Oi, você consegue me responder aqui no "+redes.getClass());
        System.out.println("------------------------------------------------");
        sms.enviarMensagem("Oi, você consegue me responder aqui no "+sms.getClass());
        System.out.println("------------------------------------------------");
        wpp.enviarMensagem("Oi, você consegue me responder aqui no "+wpp.getClass());

    }
}
