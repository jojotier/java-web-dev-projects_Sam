import java.util.ArrayList;
public abstract class Question {
    private String questionText;
    private int pointValue;

    public Question(int pointValue, String questionText){
        this.pointValue = pointValue;
        this.questionText = questionText;
    }


    public void printQuestions(){
        System.out.println(questionText);
    }

    public abstract void printAnswers();

    public abstract int getAnswersFromUsers();

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
