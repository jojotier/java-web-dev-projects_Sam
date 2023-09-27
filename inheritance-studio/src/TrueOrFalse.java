import java.util.Scanner;
public class TrueOrFalse extends Question{

    private boolean correctAnswer;

public TrueOrFalse(int pointValue, String questionText, boolean correctAnswer){
    super(pointValue, questionText);
    setPointValue(1);
    this.correctAnswer = correctAnswer;
}


    public boolean isCorrectAnswer(boolean possibleAnswer) {
    return possibleAnswer == correctAnswer;
    }

    @Override
    public void printAnswers(){
    System.out.println("True or false?");
    }

    @Override
    public int getAnswersFromUsers(){
    Scanner answer = new Scanner(System.in);
    System.out.println("Type 'f' for false and 'T' for true.");
    String userAnswer = answer.nextLine();
    if (userAnswer.indexOf('T') >= 0){
        if(isCorrectAnswer(true)){
            return 1;
        } else{
            return 0;
        }
    } else {
        if(isCorrectAnswer(false)){
            return 1;
        } else{
            return 0;
        }
    }
    }

}
