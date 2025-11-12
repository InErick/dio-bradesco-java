package Classes.Exericios.Ex02;

/*
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
Ligar o carro;
Desligar o carro;
Acelerar;
diminuir velocidade;
virar para esquerda/direita
verificar velocidade;
trocar a marcha
Siga as seguintes regras na implementação

Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
O carro desligado não pode realizar nenhuma função;
Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
 */
public class Carro {

    private int speed;
    private int gear;
    private boolean control;
    private String direction;

    public int getSpeed(){
        return speed;
    }
    public int getGear(){
        return gear;
    }
    public boolean getControl(){
        return control;
    }
    public String getDirection(){
        return direction;
    }

    public Carro(){
        this.speed = 0;
        this.gear = 0;
        this.control = false;
        this.direction = "Straight";
    }

    public void turnOn(){
        if(gear == 0 && !control){
            this.control = true;
            System.out.println("Seu carro foi ligado no Ponto Morto.");
        }else if(control){
            System.out.println("O carro já está ligado.");
        }else{
            System.out.println("Não é possível ligar o carro com marcha engatada. Mude para o ponto morto.");
        }
    }
    public void turnOff(){
        if(gear == 0 && speed == 0){
            this.control = false;
            System.out.println("Você desligou o carro");
        }else{
            System.out.println("Você não pode desligar o carro em movimento ou sem estar no ponto morto");
        }
    }
    public void accelerate(){
        if(!control) {
            System.out.println("O carro ta desligado");
            return;
        }

        if(speed >= 120){
            System.out.println("Calmae toreto, pode não. Você já ta a 120Km/h");
            return;
        }

        if(gear == 0){
            System.out.println("Você está em ponto morto, não pode acelerar.");
            return;
        }

        int maxLimit = 0;

        switch(gear){
            case 1: maxLimit = 20; break;
            case 2: maxLimit = 40; break;
            case 3: maxLimit = 60; break;
            case 4: maxLimit = 80; break;
            case 5: maxLimit = 100; break;
            case 6: maxLimit = 120; break;
        }
        if(speed < maxLimit){
            this.speed += 1;
            System.out.println("Sua velocidade atual é de "+speed+"km/h");
        }else{
            System.out.println("Troque para a marcha "+(gear + 1)+". Limite de "+maxLimit+"Km/h atingido.");
        }
    }
    public void decelerate(){
        if(control){
            if(speed > 0){
                this.speed -= 1;
                System.out.println("Sua velocidade atual é de "+speed+"Km/h");
            }else{
                System.out.println("Você está a 0Km/h.");
            }
        }else{
            System.out.println("O carro ta desligado");
        }
    }
    public void turn(String direction){
        if(!control){
            System.out.println("O carro ta desligado");
            return;
        }
        if(speed >= 1 && speed <= 40){
            switch (direction) {
                case "left" -> this.direction = "Left";
                case "right" -> this.direction = "right";
                case "straight" -> this.direction = "straight";
                default -> System.out.println("Direção inválida.");
            }
            System.out.println("Virando para: " + this.direction);
        } else {
            System.out.println("Só pode virar entre 1km/h e 40km/h. Velocidade atual: " + speed + "Km/h");
        }
    }
    public void changeGear(String value){
        if(!control){
            System.out.println("O carro ta desligado");
            return;
        }
        if (value.equals("+")) {
            // Sobe marcha (máximo 6)
            if (this.gear < 6) {
                this.gear += 1;
                System.out.println("Você passou para a " + gear + " marcha");
            } else {
                System.out.println("Você já está na marcha máxima (6ª).");
            }
        } else if (value.equals("-")) {
            if (this.gear > 0) {
                if(this.gear == 2 && speed > 20){
                    System.out.println("Velocidade muito alta ("+speed+"Km/h) para descer para a 1ª marcha. Diminua a velocidade.");
                } else if (this.gear == 3 && speed > 40) {
                    System.out.println("Velocidade muito alta para descer para a 2ª marcha.");
                }
                this.gear -= 1;
                System.out.println("Você passou para a " + gear + " marcha");
            } else {
                System.out.println("Você já está no Ponto Morto (0).");
            }
        } else {
            System.out.println("Entrada invalida. Use '+' para subir ou '-' para descer.");
        }
    }
}