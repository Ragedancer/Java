import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {
    public Integer getWrongGuess() {
        return wrongGuess;
    }

    public void addWrongGuess() {
        this.wrongGuess++;
    }

    private Integer wrongGuess;
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
            sc.close();
            Main.main(null);
        }
        else if (userInput == 'n'){
            sc.close();
            System.out.println("Thats lame");
        }
        else{
            System.out.println("What was that again?");
            playAgain();
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

