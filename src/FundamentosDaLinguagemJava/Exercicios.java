package FundamentosDaLinguagemJava;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("=========Exercicio 1==========");
        System.out.println("Qual o seu nome ? ");
        String name = scanner.next();
        System.out.println("Em que ano você nasceu ? ");
        int yearOfBirth = scanner.nextInt();
        int age = 2025 - yearOfBirth;
        System.out.printf("Olá %s você tem %s anos",name,age);

//        System.out.println("=========Exercicio 2==========");
//        System.out.println("Digite o tamanho do lado de um quadrado");
//        int side = scanner.nextInt();
//        System.out.printf("A área desse quadrado é %s",side*side);

//        int difference;
//        System.out.println("=========Exercicio 3==========");
//        System.out.println("Qual o seu nome ?: ");
//        String name = scanner.next();
//        System.out.println("E qual a sua idade ?: ");
//        int age = scanner.nextInt();
//        System.out.println("Agora digite outro nome: ");
//        String name2 = scanner.next();
//        System.out.println("Agora a idade dessa outra pessoa: ");
//        int age2 = scanner.nextInt();
//
//        if(age > age2){
//            difference = age - age2;
//        }else{
//            difference = age2 - age;
//        }
//
//        System.out.printf("A diferença entre as duas idades é de : %s anos",difference);
    }
}
