import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Student extends JFrame implements ActionListener
{
	JFrame studentFrame = new JFrame();
	JButton play;
	JButton theBackButton;
	JComboBox <String> chooseTest;
	Teacher theTest;
	
	
	
	// Constructor
	Student()
	{
		this.setTitle("Student section"); // Title of the Frame
		this.setSize(700, 700); // Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true); // Frame is Visible now
		
		// Buttons
		
		play = new JButton(); // removes test
		theBackButton = new JButton(); // go back program
		
		play.setBounds(450, 100, 150, 50);
		theBackButton.setBounds(50, 600, 150, 50);
		
		play.setText("Play");
		theBackButton.setText("Go back");
		
		play.setFocusable(false);
		theBackButton.setFocusable(false);
		
		play.addActionListener(this);
		theBackButton.addActionListener(this);
		
		this.add(play);
		this.add(theBackButton);
		
		// ComboBox
		chooseTest = new JComboBox();
		chooseTest.setBounds(50,100,200,50);
		this.add(chooseTest);
		chooseTest.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		

		if(e.getSource()== play)
		{
			Game newGame = new Game();
		}
		
		if(e.getSource()== theBackButton)
		{
			this.dispose();
		}
		
		if(e.getSource()== chooseTest)
		{
			chooseTest.getSelectedItem();
		}
		
	}
}
