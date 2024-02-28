import java.util.ArrayList;

public class QuestionModel {
	
public String QuestionText;
public String CorrectAnswer;
public ArrayList<String>PossibleAnswers;

public QuestionModel(String questionText, String correctAnswer, ArrayList<String> possibilities)
		 {
	QuestionText = questionText;
	CorrectAnswer = correctAnswer;
	PossibleAnswers = possibilities;
		 }
}
