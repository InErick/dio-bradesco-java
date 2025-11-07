package Classes;

import java.time.OffsetDateTime;

public class Person {
    // Atributos
    private final String name; // Final indica que é uma constante
    private int age;
    private int lastYearAgrInc = OffsetDateTime.now().getYear();

    //Constructor
    public Person (String name){
        this.name = name;
        this.age = 1;
    }    // o this fala básicamente que, ele quer acessar o atributo da classe para atribuir o parametro

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    //Props
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    //Métodos
    public void incAge(){
        if(this.lastYearAgrInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgrInc = OffsetDateTime.now().getYear();
    }


}
