package HerancaPolimorfismo;

import HerancaPolimorfismo.domain.Employee;
import HerancaPolimorfismo.domain.Maneger;
import HerancaPolimorfismo.domain.Salesman;

public class Main {
    public static void main(String[] args) {
        printEmpoyee(new Maneger());
        printEmpoyee(new Salesman());
    }

    public static void printEmpoyee(Employee employee){

        System.out.printf("=========%s=========\n",employee.getClass().getCanonicalName());
        if(employee instanceof Maneger maneger){// Asism alem dele verificar se é um maneger, ele gera uma variavel(maneger) nessa instância

        }

        switch (employee){
            case Maneger maneger ->{
                maneger.setCode("123");
                maneger.setName("Erick");
                maneger.setLogin("Erick123");
                maneger.setPassword("senha");
                maneger.setSalary(2000);
                maneger.setComission(500);

                System.out.println(maneger.getCode());
                System.out.println(maneger.getLogin());
                System.out.println(maneger.getPassword());
                System.out.println(maneger.getName());
                System.out.println(maneger.getSalary());
                System.out.println(maneger.getComission());
                System.out.println(maneger.getFullSalary(1000));
            }
            case Salesman salesman ->{
                salesman.setCode("321");
                salesman.setName("Lara");
                salesman.setSalary(500);
                salesman.setPercentPerSold(5);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary());
        System.out.println("===================");
    }
}
