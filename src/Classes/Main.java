package Classes;

public class Main {
    public static void main(String[] args) {
//        var sc = new Scanner(System.in);
//
//        var male = new Person("Erick");
//        male.incAge();
//        male.incAge();
//        male.incAge();
//        male.incAge();
//        male.incAge();
//        male.incAge();
//
//        var female = new Person("Lara",24);
//
//        System.out.println("Male name: "+ male.getName() + " age: "+male.getAge());
//        System.out.println("Female name: "+female.getName() + " age: "+female.getAge());

        var person = new PersonRecord("Erick");// Uma vez instânciado, eu não consigo alterar os atributos.
        System.out.println(person.getInfo());
        System.out.println(person.name());
        // Exemplo para caso eu queira "mudar" a idade, preciso instanciar novamente
    }
}
