import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class answers extends JFrame implements ActionListener
{
	
	// GUI
	JTextField forQuestions;
	JTextField answerFieldA;
	JTextField answerFieldB;
	JTextField answerFieldC;
	JTextField answerFieldD;
	JTextField rightAnswer;
	JButton submitButton;
	
	//GUI Labels
	JLabel question_label;
	JLabel label_A;
	JLabel label_B;
	JLabel label_C;
	JLabel label_D;
	JLabel correctAnswer_Field;
	
	// Variables and Arrays
	ArrayList <QuestionModel> new_questions = new ArrayList <QuestionModel>();
//	ArrayList <String> answers_ABCD = new ArrayList();
//	ArrayList <String> correct_answers = new ArrayList();
	
	
	// Constructors
	answers()
	{
		
		// JFrame
		this.setTitle("Questions & answers Section"); // Title of the Frame
		this.setSize(700, 700); // Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true); // Frame is Visible now
		
		// JLabels
		question_label = new JLabel("Input Question");
		question_label.setFont(new Font("Arial", Font.BOLD, 15));
		question_label.setHorizontalTextPosition(JLabel.CENTER);
		question_label.setHorizontalAlignment(JLabel.LEFT);
		question_label.setBounds(50, 125, this.getWidth(), 30);
		this.add(question_label);
		
		label_A = new JLabel("A:");
		label_A.setFont(new Font("Arial", Font.BOLD, 15));
		label_A.setHorizontalTextPosition(JLabel.CENTER);
		label_A.setHorizontalAlignment(JLabel.LEFT);
		label_A.setBounds(50, 325, this.getWidth(), 30);
		this.add(label_A);
		
		label_B = new JLabel("B:");
		label_B.setFont(new Font("Arial", Font.BOLD, 15));
		label_B.setHorizontalTextPosition(JLabel.CENTER);
		label_B.setHorizontalAlignment(JLabel.LEFT);
		label_B.setBounds(400, 325, this.getWidth(), 30);
		this.add(label_B);
		
		label_C = new JLabel("C:");
		label_C.setFont(new Font("Arial", Font.BOLD, 15));
		label_C.setHorizontalTextPosition(JLabel.CENTER);
		label_C.setHorizontalAlignment(JLabel.LEFT);
		label_C.setBounds(50, 525, this.getWidth(), 30);
		this.add(label_C);
		
		label_D = new JLabel("D:");
		label_D.setFont(new Font("Arial", Font.BOLD, 15));
		label_D.setHorizontalTextPosition(JLabel.CENTER);
		label_D.setHorizontalAlignment(JLabel.LEFT);
		label_D.setBounds(400, 525, this.getWidth(), 30);
		this.add(label_D);
		
		correctAnswer_Field = new JLabel("Correct Answer (A,B,C,D): ");
		correctAnswer_Field.setFont(new Font("Arial", Font.BOLD, 13));
		correctAnswer_Field.setHorizontalTextPosition(JLabel.CENTER);
		correctAnswer_Field.setHorizontalAlignment(JLabel.LEFT);
		correctAnswer_Field.setBounds(450, 125, this.getWidth(), 30);
		this.add(correctAnswer_Field);
		
		
		// TextField to input questions
		forQuestions = new JTextField();
		forQuestions.setPreferredSize(new Dimension(250,40));
		forQuestions.setBounds(50, 150, 250, 40); 
		this.add(forQuestions);
		forQuestions.setVisible(true);
		
		// TextFields for giving the answers to the question
		
		answerFieldA = new JTextField();
		answerFieldA.setPreferredSize(new Dimension(250,40));
		answerFieldA.setBounds(50, 350, 250, 40); 
		this.add(answerFieldA);
		answerFieldA.setVisible(true);
		
		answerFieldB = new JTextField();
		answerFieldB.setPreferredSize(new Dimension(250,40));
		answerFieldB.setBounds(400, 350, 250, 40); 
		this.add(answerFieldB);
		answerFieldB.setVisible(true);
		
		answerFieldC = new JTextField();
		answerFieldC.setPreferredSize(new Dimension(250,40));
		answerFieldC.setBounds(50, 550, 250, 40); 
		this.add(answerFieldC);
		answerFieldC.setVisible(true);
		
		answerFieldD = new JTextField();
		answerFieldD.setPreferredSize(new Dimension(250,40));
		answerFieldD.setBounds(400, 550, 250, 40); 
		this.add(answerFieldD);
		answerFieldD.setVisible(true);
		
		// Correct Answer Field
		rightAnswer = new JTextField();
		rightAnswer.setPreferredSize(new Dimension(150,40));
		rightAnswer.setBounds(450, 150, 200, 40); 
		this.add(rightAnswer);
		rightAnswer.setVisible(true);
		
		
		// Submit button
		submitButton = new JButton("Submit");
		submitButton.setBounds(320, 150, 80, 40); 
		this.add(submitButton);
		submitButton.addActionListener(this);
		submitButton.setFocusable(false);
		submitButton.setVisible(true);
		
		
	}
	
	// Methods
	
//	public void saveOptionsAnswers()
//	{
//		new_questions.add(answerFieldA.getText());
//		new_questions.add(answerFieldB.getText());
//		new_questions.add(answerFieldC.getText());
//		new_questions.add(answerFieldD.getText());
//		
//	}
	
//	public void saveAnswer()
//	{
//		new_questions.add(rightAnswer.getText()); 
//	}
	
//	public void saveQuestion()
//	{
//		new_questions.add(question);
//	}
	
	public ArrayList <QuestionModel> getQuestion()
	{
		return new_questions;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()== submitButton)
		{
			var questionText = forQuestions.getText();
			var answer = rightAnswer.getText(); 
			
			ArrayList<String> possibilities = new ArrayList<String>();
			
			var a = answerFieldA.getText();
			var b = answerFieldB.getText();
			var c = answerFieldC.getText();
			var d = answerFieldD.getText();
			
			possibilities.add(a);
			possibilities.add(b);
			possibilities.add(c);
			possibilities.add(d);
			//test
			QuestionModel question = new QuestionModel(
					questionText, answer, possibilities
					);
			
			
			new_questions.add(question);
			
			// saveQuestion();
			// saveOptionsAnswers();
			//saveAnswer();
			this.dispose();
		}
	}
}
