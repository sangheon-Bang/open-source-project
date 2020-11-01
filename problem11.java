package Task7;
import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(FlowLayout.CENTER,6,6));
		JButton jb=new JButton("Open");
		add(jb);
		jb=new JButton("Read");
		add(jb);
		jb=new JButton("Close");
		add(jb);
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		setBackground(Color.WHITE);
		JLabel label=new JLabel("Hello");
		label.setLocation(100,20);
		label.setSize(30,10);
		add(label);
		label=new JLabel("Love");
		label.setLocation(200,130);
		label.setSize(30,10);
		add(label);
		label=new JLabel("Java");
		label.setLocation(20,160);
		label.setSize(30,10);
		add(label);
	}
}

class SwingApplication extends JFrame{
	public SwingApplication() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		NorthPanel np=new NorthPanel();
		c.add(np,BorderLayout.NORTH);
		CenterPanel cp=new CenterPanel();
		c.add(cp,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
}


public class problem11 {
	public static void main(String[] args) {
		new SwingApplication();
	}
}
