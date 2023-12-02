import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static List<String> stringList = new ArrayList<>();
    static Hangman hm = new Hangman();
    static Scanner sc = new Scanner(System.in);
    static boolean lean;
    static int wrongGuess = 0;
    static Random ran = new Random();
    public static void main(String[] args) {
        stringList.add("cat");
        stringList.add("boat");
        stringList.add("champagne");
        stringList.add("the bog hog");
        lean = true;

        String answer = stringList.get(ran.nextInt(stringList.size()));
        List<String> linesForWord = hm.getList(answer);
        do{
            System.out.println("Guess the word " + linesForWord);
            char userGuess = sc.next().charAt(0);
            int index = 0;
            if(answer.contains(String.valueOf(userGuess))) {
                for (char c : answer.toCharArray()) {
                    if (c != userGuess) {

                        index++;
                    }
                    else {
                        linesForWord.set(index, String.valueOf(c));
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
        while(linesForWord.contains("_") && lean);
        if (!lean){
            System.out.println("You lose, wanna play again?"+ linesForWord + "\n" + hm.getMan(wrongGuess) + "\n" + "Type y to play again, type n if you don't.");
            hm.playAgain();
        }
        else{
            System.out.println("You win, thats amazing! Wanna play again?" + linesForWord + "\n" + hm.getMan(wrongGuess) + "\n" + "Type y to play again, type n if you don't.");
            hm.playAgain();
        }



    }
}