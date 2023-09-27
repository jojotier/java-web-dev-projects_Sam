import java.util.Scanner;
import java.util.ArrayList;
public class MultipleChoice extends Question{

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(int pointValue, String questionText, ArrayList<String> possibleAnswers, int correctAnswers){
        super(pointValue, questionText);
        setPointValue(1);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public void printAnswers(){
        for(int answersIndex = 0; answersIndex < possibleAnswers.size(); answersIndex++){
            System.out.println(possibleAnswers.get(answersIndex));
        }
    }

    public boolean isCorrectAnswer(int userAnswer){
        return userAnswer == correctAnswer;
    }

    @Override
    public int getAnswersFromUsers(){
        Scanner answer = new Scanner(System.in);
        System.out.println("Please choose a number from 1 through 4.");
        String userInput = answer.nextLine();
        int result = Integer.parseInt(userInput);
        if(isCorrectAnswer(result) == true){
            return 1;
        } else{
            return 0;
        }
    }
}
