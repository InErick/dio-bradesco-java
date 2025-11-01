package EstruturaDeControle;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var name = "";
        do{
            System.out.println("Informe um nome ");
            name = sc.next();
            System.out.println(name);

        } while(!name.equalsIgnoreCase("exit"));
    }
}
