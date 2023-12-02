import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {

    public List<String> getList(String str){
        List<String> sl = new ArrayList<>();
        for(char c: str.toCharArray()){
            if (c == ' '){
                sl.add(" ");
            }
            else{
                sl.add("_");
            }

        }
        return sl;
    }

    public void playAgain(){
        Scanner sc = new Scanner(System.in);
        char userInput = sc.next().charAt(0);
        userInput = Character.toLowerCase(userInput);
        if (userInput == 'y'){
            Main.main(null);
        }
        else if (userInput == 'n'){
            System.out.println("Thats lame");
            sc.close();
        }
        else{
            System.out.println("What was that again?");
            playAgain();
            sc.close();
        }
    }
    public String getMan(Integer wrongNumber){
        switch (wrongNumber){
            case 0:
                return (" +---+\n" +
                        "     |\n" +
                        "     |\n" +
                        "     |\n" +
                        "    ===");
            case 1:
                return (" +---+\n" +
                        " O   |\n" +
                        "     |\n" +
                        "     |\n" +
                        "    ===");
            case 2:
                return (" +---+\n" +
                        " O   |\n" +
                        " |   |\n" +
                        "     |\n" +
                        "    ===");
            case 3:
                return (" +---+\n" +
                        " O   |\n" +
                        " |   |\n" +
                        " |   |\n" +
                        "    ===");
            case 4:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|   |\n" +
                        " |   |\n" +
                        "    ===");
            case 5:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|-  |\n" +
                        " |   |\n" +
                        "    ===");
            case 6:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|-  |\n" +
                        " |   |\n" +
                        "/   ===");
            case 7:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|-  |\n" +
                        " |   |\n" +
                        "/ \\ ===");
        }
        return "error";
        }


    }

