import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button1;
	JButton button2;
	JButton button3;
	JLabel label;
	
	MyFrame()
	{
		button1 = new JButton(); // Access to Teacher side
		button2 = new JButton(); // Access to Student side
		button3 = new JButton(); // Exit program
		
		//Position of buttons
		
		button1.setBounds(75 , 350, 150, 50); 
		button2.setBounds(275, 450, 150, 50);
		button3.setBounds(475, 350, 150, 50);
		
		//Frame & addition of buttons
		
		this.setTitle("Quiz Game for Music Students"); // Title of the Frame
		this.setSize(700, 700); // Frame Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true); // Frame is Visible now
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		// Button text & more
		
		button1.setText("Teacher");
		button2.setText("Exit");
		button3.setText("Student");
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		
		// Action listeners
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		// Title
		label = new JLabel("Music Quiz Game");
		label.setFont(new Font("Arial", Font.PLAIN, 40));
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 50, this.getWidth(), 30);
		this.add(label);
		
		
		// Cosmetics
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== button1){
			Teacher myTeacher = new Teacher();
		}
		
		if(e.getSource()== button2){
			System.exit(0);
		}
		
		if(e.getSource()== button3){
			Student myStudent = new Student();
		}
	}
	
}
