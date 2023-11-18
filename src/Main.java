import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Methods method = new Methods();
//        //System.out.print(method.getNumber(25));
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Sam");
//        stringList.add("romor");
//        stringList.add("nascar");
//        stringList.add("kayak");
//        for(String str: stringList){
//            System.out.println(method.getPalindrome(str));
//        }
        List<String> stringList = new ArrayList<>();
        stringList.add("cat");
        stringList.add("boat");
        stringList.add("champagne");
        stringList.add("the bog hog");
        Hangman hm = new Hangman();
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        int wrongGuess = 0;
        Random ran = new Random();
        String answer = stringList.get(ran.nextInt(stringList.size()));
        List<String> linesForWord = hm.getList(answer);
        do{
            System.out.println("Guess the word " + linesForWord);
            char userguess = sc.next().charAt(0);
            int index = 0;
            if(answer.contains(String.valueOf(userguess))) {
                for (char c : answer.toCharArray()) {
                    if (c != userguess) {

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
                    bool = false;
            }
        }
        while(linesForWord.contains("_") && bool);
        if (!bool){
            System.out.println("You lose"+ linesForWord + "\n" + hm.getMan(wrongGuess));
        }
        else{
            System.out.println("You win, thats amazing!" + linesForWord + "\n" + hm.getMan(wrongGuess));

        }



    }
}