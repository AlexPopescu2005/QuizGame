import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Questions extends JFrame implements ActionListener
{
	//Variables SQL
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/root";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "alnick1205";
	
	JButton addQuestion;
	JButton removeQuestion;
	JButton goBackButton;
	JComboBox <String> QuestionDisplay;
	answers theQuestions;
	
	// Constructor
	Questions()
	{	
	
		this.setTitle("Questions Section"); // Title of the Frame
		this.setSize(700, 700); // Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true); // Frame is Visible now
		
		
		// Buttons
		
		addQuestion = new JButton(); // adds test
		removeQuestion = new JButton(); // removes test
		goBackButton = new JButton(); // go back program
		
		
		addQuestion.setBounds(300, 100, 150, 50); 
		removeQuestion.setBounds(500, 100, 150, 50);
		goBackButton.setBounds(50, 600, 150, 50);
		
		addQuestion.setText("Add Question");
		removeQuestion.setText("Remove Question");
		goBackButton.setText("Go back");
		
		addQuestion.setFocusable(false);
		removeQuestion.setFocusable(false);
		goBackButton.setFocusable(false);
		
		addQuestion.addActionListener(this);
		removeQuestion.addActionListener(this);
		goBackButton.addActionListener(this);
		
		this.add(addQuestion);
		this.add(removeQuestion);
		this.add(goBackButton);
		
		// ComboBox to display the Questions
		
		QuestionDisplay = new JComboBox <String>();
		QuestionDisplay.setBounds(50,100,200,50);
		this.add(QuestionDisplay);
		
		try {
			Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			
			String selectSQL = "SELECT question FROM test";
            
			try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    String question = resultSet.getString("question");
                    QuestionDisplay.addItem(question);
                }
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Methods
	
	public void tooManyQuestions()
	{
		
		if(theQuestions.getQuestion().size() == 10)
		{
			JOptionPane.showMessageDialog(null, "You have reached the limit of questions", "Max Amount Questions", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	public void removeLastQuestions(int index)
	{
		if(!theQuestions.getQuestion().isEmpty() && index >= 0 && index < theQuestions.getQuestion().size())
		{
			theQuestions.remove(index);
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== addQuestion)
		{
			answers newAnswers = new answers();
			tooManyQuestions();
		}
		
		if(e.getSource()== removeQuestion)
		{
			int lastIndex = theQuestions.getQuestion().size()-1;
			removeLastQuestions(lastIndex);
		}
		
		if(e.getSource()== goBackButton)
		{
			this.dispose();
		}
		
		
	}
}
