import java.util.Objects;
import java.util.Scanner;

public class Game {
    private byte score1;
    private byte score2;

    private String guess;
    private String blank = "";

    Scanner scanner = new Scanner(System.in);

    public boolean player1(){
        blank = "";
        System.out.println("Enter guess");
        guess = scanner.next();
        BlakCreation(StartGame.secret2, score2);
        return Check();
    }
    public boolean player2(){
        blank = "";
        System.out.println("Enter guess");
        guess = scanner.next();
        BlakCreation(StartGame.secret1, score1);
        return Check();
    }

    public void BlakCreation(String ans, int playerScore){
        for (int i = 0; i < ans.length(); i++) {
            if(guess.charAt(i) == ans.charAt(i)){
                blank += "g";
            }
            else {blank += "_";}
        }
        if(blank.length() < ans.length()){
            for (int i = 0; i < ans.length() - blank.length(); i++) {
                blank += '_';
            }
        }
        PrintWring(blank);
        playerScore++;
    }


    private void PrintWring(String blank){
        System.out.println("WrongLetters: "+ blank);
    }

    private boolean Check(){
        for (int i = 0; i < blank.length(); i++) {
            if(blank.charAt(i) != 'g'){
                return false;
            }
        }
        return true;
    }
}
