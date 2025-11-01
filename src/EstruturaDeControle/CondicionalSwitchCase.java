package EstruturaDeControle;

import java.util.Scanner;

public class CondicionalSwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um numero de 1 ate 7");
        var option = scanner.nextInt();

        var message = switch(option){
            case 1,7 -> {
                var day = option == 1 ? "Domingo" : "Sabado";
                yield String.format("Hoje e %s, fim de semana \\o/",day);
            }
            case 2 -> ("Segunda");
            case 3 -> ("Terca");
            case 4 -> ("Quarta");
            case 5 -> ("Quinta");
            case 6 -> ("Sexta");
            default -> ("Opcao invalida");
        };
        System.out.println(message);
//        switch(option){
//            case 1:
//            case 7:
//                System.out.println("Fim de semana"); //Vai executar no caso de case 1 e case 7
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terca");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            default:
//                System.out.println("Opcao invalida");
//        }
    }
}
