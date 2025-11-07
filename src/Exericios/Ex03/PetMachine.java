package Exericios.Ex03;

public class PetMachine {
    private boolean clean = true;
    private int watter = 30;
    private int shampoo = 10;
    private Pet pet;



    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        this.watter -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet "+pet.getName()+" está limpo");
    }

    public void addWatter(){
        if(watter == 30){
            System.out.println("A capacidade de armazenamento de agua da maquina está no máximo");
            return;
        }
        watter+=2;
    }
    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de armazenamento de shampoo da maquina está no máximo");
            return;
        }
        shampoo+=2;
    }

    public int getWatter() {
        return watter;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }
        if(hasPet()){
            System.out.println("O pet "+this.pet.getName()+" está na máquina nesse momento");
        }
        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet "+this.pet.getName()+" está limpo");
        this.pet = null;
    }

    public void wash(){
        this.watter -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
