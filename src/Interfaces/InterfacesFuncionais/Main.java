package Interfaces.InterfacesFuncionais;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Maria",21),
                new User("Erick",23),
                new User("Eduardo", 33),
                new User("Larayanne",24)
                );
        //users.forEach(System.out::println);
        printStringValue(User::toString,users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
