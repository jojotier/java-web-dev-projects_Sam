import java.util.ArrayList;
public abstract class Question {
    private String questionText;
    private ArrayList<String> possibleAnswers;

    private ArrayList<String> correctAnswers;

    public double gradingQuiz(){
        return 0;
    }

    public void printQuestions(){

    }

    public void printAnswers(){

    }

    private void checkAnswers(){

    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
