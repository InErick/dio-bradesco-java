package EstruturaDeControle;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

//        System.out.println("====Exercicio 1====");
//        System.out.println("Digite um número");
//        int number = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i + " x " + number + " = "+ i*number);
//        }

//        System.out.println("====Exercicio 2====");
//        System.out.println("Digite o seu peso");
//        var weight = sc.nextDouble();
//        System.out.println("Agora digite a sua altura");
//        var height = sc.nextDouble();
//
//        double imc = weight/(height*height);
//
//        var message = "";
//        if(imc <= 18.5){
//            message = "Abaixo do peso";
//        }else if(imc <= 24.9){
//            message = "Peso ideal";
//        }else if(imc <= 29.9){
//            message = "Levemente acima do peso";
//        }else if(imc <= 34.9){
//            message = "Obesidade grau 1";
//        }else if(imc <= 39.9){
//            message = "Obesidade grau 2(Severa)";
//        }else if(imc >= 40){
//            message = "Obesidade grau 3(Mórbida)";
//        }
//        System.out.println(message);

//        System.out.println("====Exercicio 3====");
//        int number;
//        int otherNumber;
//        do{
//            System.out.println("Informe um número");
//            number = sc.nextInt();
//            System.out.printf("Informe outro numero (maior que %s)\n",number);
//            otherNumber = sc.nextInt();
//            var message = number>otherNumber ?("Digite o segundo número maior que o primeiro") : ("boa dog");
//            System.out.println(message);
//        }while(otherNumber < number);
//
//        System.out.println("Você escolhe par (1) ou impar (2) ?");
//        var question = sc.nextInt();
//
//        if(question == 1){
//            for(int i = otherNumber; i >= number; i--){
//                if(i % 2 == 0){
//                    if(i == 0) continue;
//                    System.out.println(i);
//                }
//            }
//        }else{
//            for(int i = otherNumber; i >= number; i--){
//                if(i % 2 == 1){
//                    System.out.println(i);
//                }
//            }
//        }

        System.out.println("====Exercicio 4====");

        System.out.println("Informe um número");
        var number = sc.nextInt();
        var keepVerify = true;
        while(keepVerify){
            System.out.println("Informe o número para verificação");
            var toVerify = sc.nextInt();
            if(toVerify < number) {
                System.out.printf("Informe um número maior que %s \n",number);
                continue;
            }
            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s\n",toVerify,number, result);
        }
    }
}
