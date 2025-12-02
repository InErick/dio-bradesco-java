package HerancaPolimorfismo.Exercicios.Ex01;

public class Main {
    public static void main(String[] args) {
        Normal normal = new Normal("Vingadores", 24.50,3, true);
        MeiaEntrada meia = new MeiaEntrada("Paramore", 15,2, false);
        Familia familia = new Familia("Pele",10,10,true);

        System.out.println(normal);
        System.out.println(meia);
        System.out.println(familia);
    }
}
