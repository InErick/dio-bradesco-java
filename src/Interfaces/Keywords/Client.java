package Interfaces.Keywords;

// Essa é uma classe "default" ela não pode ser instanciada em classes fora de sua hirarquis(ou resumindo fora da pasta), essa regra também é pare métodos
class Client {

    public static String staticName;
    public String name;

    public static String getStaticName() {
        return staticName;
    }

    public static void setStaticName(String param) {
        staticName = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
