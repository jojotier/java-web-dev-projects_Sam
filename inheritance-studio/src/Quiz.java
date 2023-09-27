import java.util.ArrayList;

public class Quiz {
private ArrayList<Question> questions;
private int score;
private int total;

public Quiz(ArrayList<Question> questions){
    this.questions = questions;
    this.score = 0;
    this.total = 0;
    for(int i = 0; i < questions.size(); i++){
        this.total = this.total + questions.get(i).getPointValue();
    }
}

public void addQuestions(Question newQuestions){
    this.questions.add(newQuestions);
    this.total = this.total + newQuestions.getPointValue();
}

public void runQuiz(){
    for(Question question : this.questions){
        question.printQuestions();
        question.printAnswers();
        int points = question.getAnswersFromUsers();
        updateScore(points);
    }
}

public void updateScore(int y){
    this.score = this.score + y;
}

public void gradeQuiz(){
    System.out.println("Your score is: "+score);
}

}
