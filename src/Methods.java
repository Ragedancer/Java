import java.util.List;

public class Methods {
    public int getNumber(int num){
        num = 1;
        return num;
    }
    public boolean getPalindrome(String word){
        boolean b = true;
        int length = word.length() - 1;
        System.out.println("This is the word: " + word + ". This is the length of the input word : " + length + 1);
        for(int i = 0; i < word.length();i++) {
            char first = word.charAt(i);
            System.out.println("This is first:" + first);
            char last = word.charAt(length);
            System.out.println("This is last:" + last);
            length--;
            if (last == first) {
                b = true;
            } else {
                b = false;
            }
        }
        return b;
    }


    //
    public boolean declarativePalindrome(String str){
        return new StringBuilder( str ).reverse().toString().equals( str );
    }

//    public List<Integer> getDetailsForWord(String str){
//
//    }


}
