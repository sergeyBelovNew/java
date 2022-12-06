import java.util.ArrayList;
import java.util.List;

public class Answer {

    public Answer() {
    }

    public Answer(Question question, int yourAnswer) {
        this.yourAnswer = yourAnswer;
        this.question = question;
    }

    public boolean checkCorrect() {
        if (question.getRightAnswer() == yourAnswer)
            return true;
        return false;
    }

    private int yourAnswer;
    private Question question;

}
