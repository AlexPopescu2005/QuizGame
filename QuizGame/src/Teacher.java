import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Teacher extends JFrame implements ActionListener
{
	
	// GUI
	JFrame teacherFrame = new JFrame();
	JButton addTest;
	JButton removeTest;
	JButton backButton;
	JTextArea backgroundForButtons;
	JComboBox <String> DisplayTest;
	
	// variables and lists
	answers new_questions;
	answers answers_ABCD;
	answers correct_answers;
	
	ArrayList <ArrayList<String>> theTest = new ArrayList();
	
	// Constructor
	Teacher()
	{ 
		this.setTitle("Teacher section"); // Title of the Frame
		this.setSize(700, 700); // Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true); // Frame is Visible now
		
		// Buttons
		
		addTest = new JButton(); // adds test
		removeTest = new JButton(); // removes test
		backButton = new JButton(); // go back program
		
		
		addTest.setBounds(300, 100, 150, 50); 
		removeTest.setBounds(500, 100, 150, 50);
		backButton.setBounds(50, 600, 150, 50);
		
		addTest.setText("Add Test");
		removeTest.setText("Remove Test");
		backButton.setText("Go back");
		
		addTest.setFocusable(false);
		removeTest.setFocusable(false);
		backButton.setFocusable(false);
		
		addTest.addActionListener(this);
		removeTest.addActionListener(this);
		backButton.addActionListener(this);
		
		this.add(addTest);
		this.add(removeTest);
		this.add(backButton);
		
		
		
//		theTest.add(new_questions.getQuestion());
//		theTest.add(answers_ABCD.getQuestion());
//		theTest.add(correct_answers.getQuestion());
		
		// ComboBox to display the Tests
		
		DisplayTest = new JComboBox <String>();
		DisplayTest.setBounds(50,100,200,50);
		this.add(DisplayTest);
		DisplayTest.setVisible(true);
		DisplayTest.addActionListener(this);
		
	}

	// Methods
	
	public void removeSelectedTest()
	{
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== addTest)
		{
			Questions new_Test = new Questions();
			
		}
		
		if(e.getSource()== removeTest)
		{
			
		}
		
		if(e.getSource()== backButton)
		{
			this.dispose();
		}
		
	}
}
