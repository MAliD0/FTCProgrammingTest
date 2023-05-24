
import java.io.Console;
import java.util.Scanner;

public class StartGame {
    static String secret1;
    static String secret2;
    private byte turn = 1;
    public StartGame (){
        secret1 = nameGet();
        secret2 = nameGet();
    }

    public String nameGet(){
        System.out.println("Player "+turn +" enter word");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        turn++;
        return x;
    }

    public String getSecret1() {
        return secret1;
    }

    public String getSecret2() {
        return secret2;
    }
}
