package org.launchcode;
import java.util.Scanner;
import java.util.Arrays;
public class FindAliceText {
    public static void main(String[] args){
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Type in your search here: ");
        String query = input.nextLine();
        Boolean foundInput = Arrays.asList(aliceText.toLowerCase().split(" ")).contains(query);
        if(foundInput){
            System.out.println(query + " is in the text!");
        }
        Integer index = aliceText.indexOf(query);
        Integer lengthNum = query.length();
        System.out.println("Your search term first appears at " + index+ " with a length of " + lengthNum + " characters.");
        String newAliceText = aliceText.replace(query, "");
        System.out.println(newAliceText);

    }
}