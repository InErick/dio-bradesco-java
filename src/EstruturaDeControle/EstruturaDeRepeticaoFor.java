package EstruturaDeControle;

import java.util.Scanner;

public class EstruturaDeRepeticaoFor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        for (int i = 1;i < args.length;i++){
            System.out.println(i + " - " + args[i]);
        }
    }
}
