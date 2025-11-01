package FundamentosDaLinguagemJava;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem ?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado ?");
        var isEmanciped = scanner.nextBoolean();
        var canNotDrive = age >= 18 || (isEmanciped && age >= 16);
        System.out.printf("Você pode dirigir ? (%s)", canNotDrive); // Quando eu coloco um ! antes de um booleano ele inverte o resultado
    }
}