package HerancaPolimorfismo.domain;

public sealed abstract class Employee permits Maneger, Salesman{
    protected String code;
    protected String name;
    protected String address;
    protected int age;
    protected double salary;
// O protected permite o acesso de classes herdadas, então se eu deixasse private, as classes filhas não teriam acesso aos setters por exemplo
    // E também, com o protected você consegue acessas as propriedades, desde que estejam no mesmo packeage


    public Employee(String code, String name, String address, int age, double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public abstract double getFullSalary();
}
