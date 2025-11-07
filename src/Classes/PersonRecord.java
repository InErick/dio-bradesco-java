package Classes;
/* O record é utilizado para criar a propria classe, e não uma instância dela.
    Por ex: o metodo sqrt do java.math é static, porque eu nao preciso instanciar a classe math para utilizar o metodo sqrt
            diferente do scanner, que para utilizar os metodos .nextInt() eu preciso instanciar a classe scanner

 */
public record PersonRecord(String name, int age) {

    // Esse é um compact constructor, mesmo que uma classe record "não precise" eu posso fazer validações nesse constructor
    public PersonRecord{
        System.out.println("==============");
        System.out.println(name);
        System.out.println(age);
        System.out.println("==============");
    }

    public PersonRecord(String name) {
        this(name, 2);
    }

    public String getInfo(){
        return "Name: " + name + " age: "+age;
    }
}
