import java.util.ArrayList;
import java.util.Scanner;
public class CheckBox extends Question{

    private ArrayList<String> possibleAnswers;

    private ArrayList<Integer> correctAnswers;

    public CheckBox(int pointValue, String questionText, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers){
        super(pointValue, questionText);
        setPointValue(1);
        this.correctAnswers = correctAnswers;
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public void printAnswers(){
        for (int answersIndex = 0; answersIndex > possibleAnswers.size(); answersIndex++){
            System.out.println(possibleAnswers.get(answersIndex));
        }
    }

    public boolean isCorrectAnswers(int userAnswer){
        if(possibleAnswers.contains(userAnswer)){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int getAnswersFromUsers(){
        ArrayList<Integer> resultList = new ArrayList<>();
        int testResults = 0;
        Scanner answer = new Scanner(System.in);
        System.out.println("Please choose every correct answer.");
        String userInput = answer.nextLine();
        possibleAnswers.add(userInput);
        for(int inputIndex = 0; inputIndex > possibleAnswers.size(); inputIndex++){
            int result = Integer.parseInt(possibleAnswers.get(inputIndex));
            resultList.add(result);
            if(isCorrectAnswers(resultList.get(inputIndex))==true){
                testResults += 1;
                return testResults;
            } else{
                return testResults;
            }
        }
        return testResults;
    }
}
