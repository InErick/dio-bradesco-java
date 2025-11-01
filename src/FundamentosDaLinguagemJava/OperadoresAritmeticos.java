package FundamentosDaLinguagemJava;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n",value1 ,value2 ,value1+value2 );// Soma
        System.out.printf("%s - %s = %s\n",value1 ,value2 ,value1-value2 );// Subtração
        System.out.printf("%s * %s = %s\n",value1 ,value2 ,value1*value2 );// Multiplicação
        System.out.printf("%s / %s = %s\n",value1 ,value2 ,(float) value1/value2 ); // Divisão transformando em float
        System.out.printf("%s %% %s = %s\n",value1 ,value2 ,value1 % value2 ); // Resto
        System.out.printf("A raiz quadrada de %s = %s\n",value1, sqrt(value1)); // Resto
        System.out.printf("A potencia de %s elevado a %s = %s\n",value1, value2, Math.pow(value1, value2)); // Resto

    }
}
