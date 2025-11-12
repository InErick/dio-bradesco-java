package Classes.Exericios.Ex02;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciar o carro (começa desligado e em ponto morto - gear 0)
        Carro carro = new Carro();

        // 2. Ligar o carro
        carro.turnOn();

        // 3. Engatar a primeira marcha (0 -> 1)
        carro.changeGear("+");

        System.out.println("--- Iniciando Aceleração (Marcha " + carro.getGear() + ") ---");

        // 4. Aceleração e Troca de Marchas
        for(int i = 0; i < 121; i++){
            // Tenta acelerar
            carro.accelerate();

            // Checa a velocidade ATUAL para saber se é hora de trocar de marcha
            // Note que trocamos a velocidade 120 por 101, pois a 6ª marcha vai de 101 a 120.
            if (carro.getSpeed() == 20 ||
                    carro.getSpeed() == 40 ||
                    carro.getSpeed() == 60 ||
                    carro.getSpeed() == 80 ||
                    carro.getSpeed() == 100)
            {
                // Verifica se já está na 6ª marcha antes de tentar subir
                if (carro.getGear() < 6) {
                    carro.changeGear("+");
                }
            }

            // Checa o ponto de virar o carro
            if (carro.getSpeed() == 40) {
                carro.turn("left");
                carro.turn("right");
                carro.turn("straight");
            }
        }

        System.out.println("\n--- Fim da Simulação ---");
        System.out.println("Velocidade final: " + carro.getSpeed() + " Km/h");
        System.out.println("Marcha final: " + carro.getGear());
        System.out.println("Direção final: " + carro.getDirection());
    }
}