import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Words word = new Words();
    static Hangman hm = new Hangman();
    static Scanner sc = new Scanner(System.in);
    static boolean lean;
    static int wrongGuess = 0;
    public static void main(String[] args) {
        word.setStringList();
        word.setGuessWord();
        word.setLinesForWord();
        lean = true;


        do{
            System.out.println("Guess the word " + word.getLinesForWord());
            char userGuess = sc.next().charAt(0);
            int index = 0;
            if(word.getGuessWord().contains(String.valueOf(userGuess))) {
                for (char c : word.getGuessWord().toCharArray()) {
                    if (c != userGuess) {

                        index++;
                    }
                    else {
                        word.setLetterForGuess(index, String.valueOf(c));
                        index++;
                    }
                }
            }
                else if (wrongGuess < 5){
                wrongGuess++;
                System.out.println(hm.getMan(wrongGuess));

            }
                else {
                    lean = false;
            }
        }
        while(word.getLinesForWord().contains("_") && lean);
        if (!lean){
            System.out.println("You lose, wanna play again?"+ word.getLinesForWord() + "\n" + hm.getMan(wrongGuess) + "\n" + "Type y to play again, type n if you don't.");
            hm.playAgain();
        }
        else{
            System.out.println("You win, thats amazing! Wanna play again?" + word.getLinesForWord() + "\n" + hm.getMan(wrongGuess) + "\n" + "Type y to play again, type n if you don't.");
            hm.playAgain();
        }



    }
}