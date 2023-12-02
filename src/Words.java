import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {
    private List<String> stringList = new ArrayList<>();
    private Random ran = new Random();
    private String guessWord;

    private List<String> linesForWord;
private Hangman hang = new Hangman();
    public Words(){
        this.stringList.add("hangman game");
        guessWord = stringList.get(0);
        linesForWord = hang.getList(guessWord);
    }


    public String getGuessWord() {
        return guessWord;
    }

    public void setGuessWord() {
        this.guessWord = stringList.get(ran.nextInt(stringList.size()));
    }

    public void setStringList(){
        this.stringList.add("cat");
        this.stringList.add("boat");
        this.stringList.add("champagne");
        this.stringList.add("the bog hog");
    }
    public void setLinesForWord(){
        linesForWord = hang.getList(guessWord);
    }
    public List<String> getLinesForWord() {

        return linesForWord;
    }
    public void setLetterForGuess(Integer i,String str){
        linesForWord.set(i,str);
    }
    public void addToStringList(String str){
        this.stringList.add(str);
    }

}
