package EstruturaDeControle;

import java.util.Scanner;

public class CondicionalElseIf {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        var name = scanner.next();
        System.out.println("Informe a sua idade");
        var age = scanner.nextInt();
        System.out.println("Voce e emancipado ?(s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s"); //ignora se e maiusculo ou minusculo

//        String message;
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = canDrive ? //Elvis operator
                (name+", você você pode dirigir \n") :
                (name+", você você nao pode dirigir \n");

//        if(canDrive){
//            message = (name+", você você pode dirigir \n");
//        }else{
//            message = (name+", você você nao pode dirigir \n");
//        }

        System.out.println(message);
    }
}
