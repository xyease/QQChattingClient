package view;

import java.awt.Button;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Friend_Request extends JFrame {
	private JPanel PanelButtons,Panelusr;
	private JLabel Labelusr;
	private JTextField Textusr;
	private Box b;
	protected Button BSend;
	public Friend_Request() {
		this.setTitle("Friend_Request");	
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Image/QQButton.png")));
		b = Box.createVerticalBox();
		this.setSize(400,100);
		
		Panelusr=new JPanel();
		PanelButtons=new JPanel();	
		Labelusr=new JLabel("user name:");
		Textusr=new JTextField("Please Enter in User Name");
		BSend= new Button("Send");
		
		Panelusr.add(Labelusr);
		Panelusr.add(Textusr);
		PanelButtons.add(BSend);
		
		b.add(Panelusr);
		b.add(PanelButtons);

	    this.add(b);   
	    this.setContentPane(b);	    
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public String Getusrname() {return Textusr.getText();}
	/*
    public static void main(String[] args){
    	//System.out.println("1");
    	Friend_Request w=new Friend_Request();
    }
    */
}
