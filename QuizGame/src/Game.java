import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Game extends JFrame implements ActionListener
{
	// Variables
	
	Questions totalQuestions;
	char guess;
	int index;
	int correct_guesses = 0;
	int result;
	
	// GUI components
	
	JFrame gameFrame = new JFrame();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	JTextField questionField = new JTextField();
	JTextArea textArea = new JTextArea();
	JLabel answerLabelA = new JLabel();
	JLabel answerLabelB = new JLabel();
	JLabel answerLabelC = new JLabel();
	JLabel answerLabelD = new JLabel();
	
	// Constructor
	public Game() 
	{
		// Configurations GUI
		
		
		// Frame
		this.setTitle("Quiz"); // Title of the Frame
		this.setSize(700, 700); // Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true); // Frame is Visible now
	
		// Question Area
		questionField.setBounds(0,0,750,50);
		questionField.setEditable(false);
		questionField.setHorizontalAlignment(JTextField.CENTER);
		questionField.setFont(new Font("Arial", Font.BOLD,30));
		this.add(questionField);
		
		// Text Area
		
		
		
		//Buttons
		
		buttonA.setBounds(0,150,100,100);
		buttonA.setFont(new Font("Arial", Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,250,100,100);
		buttonB.setFont(new Font("Arial", Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,350,100,100);
		buttonC.setFont(new Font("Arial", Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,450,100,100);
		buttonD.setFont(new Font("Arial", Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		this.add(buttonA);
		this.add(buttonB);
		this.add(buttonC);
		this.add(buttonD);
		
		// Answer Labels
		
		answerLabelA.setBounds(125,100,500,100);
		answerLabelA.setFont(new Font("Arial", Font.PLAIN,35));
		
		answerLabelB.setBounds(125,200,500,100);
		answerLabelB.setFont(new Font("Arial", Font.PLAIN,35));
		
		answerLabelC.setBounds(125,300,500,100);
		answerLabelC.setFont(new Font("Arial", Font.PLAIN,35));
		
		answerLabelD.setBounds(125,400,500,100);
		answerLabelD.setFont(new Font("Arial", Font.PLAIN,35));
		
		this.add(answerLabelA);
		this.add(answerLabelB);
		this.add(answerLabelC);
		this.add(answerLabelD);
		
		// number right 
		
		number_right.setBounds(225,225,200,100);
		number_right.setFont(new Font("Arial", Font.PLAIN,40));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		
		// Percentage
		
		percentage.setBounds(225,325,200,100);
		percentage.setFont(new Font("Arial", Font.PLAIN,40));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		
		nextQuestion();
		
	}
	
	
	// Methods
	public void nextQuestion() 
	{
		
	}

	
	// Button method
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}
	
	public void displayAnswer() 
	{
		
	}
	
	public void results() 
	{
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		
	}
}
