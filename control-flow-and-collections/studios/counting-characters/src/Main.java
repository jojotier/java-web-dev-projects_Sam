import java.util.ArrayList;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        String originalQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        ArrayList<Character> charsArrayList = new ArrayList<>();
        for (char c : originalQuote.toCharArray()){
            charsArrayList.add(c);
        }

        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (Character index : charsArrayList){
            Integer counter = charCount.get(index);
            charCount.put(index, counter == 0 ? 1 : counter+1);
        }

        for (HashMap.Entry<Character,Integer> val : charCount.entrySet()){
            System.out.println(val.getKey() + ":" + val.getValue());
        }
    }
}