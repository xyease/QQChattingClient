package view;

import javax.swing.*;
//import java.util.*;
import java.awt.*;
//import java.awt.event.*;

public class Login extends JFrame {
	//JFrame LoginWindow=new JFrame("LogIn");
	private Box b;
	//private BoxLayout layout;
	private JPanel PanelButtons,Panelusr,Panelpass;
	private JTextField Textusr;
	private JPasswordField Textpass;
	private JLabel Labelusr,Labelpass;
	protected Button Buttlog,Buttreg,ButtFget;
	public Login(){
		this.setTitle("QQ2017");
		//this.setLayout(new GridLayout(5,1));		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Image/QQButton.png")));
		b = Box.createVerticalBox();
		this.setSize(400,200);
	    //layout=new BoxLayout(b,BoxLayout.Y_AXIS);
	   //b.setLayout(layout);
		Panelusr=new JPanel();
		Panelpass=new JPanel();
		PanelButtons=new JPanel();
		//Panelpass.setLayout(null);
		
	    Labelusr=new JLabel("user name:");
	    Labelpass=new JLabel("password:");
	    
	    Textusr=new JTextField("Please Enter in User Name");
	    Textpass=new JPasswordField();
	    Textpass.setBounds(104, 163, 154, 26);
	    Textpass.setText("Pleaseeeeeee");
	    Textpass.setEchoChar('●');	   
	    
	    

	    Buttlog=new Button("Log In");
	    Buttreg=new Button("Register");
	    ButtFget=new Button("Forget password?");
	    
	    
	    Panelusr.add(Labelusr);
	    Panelusr.add(Textusr);
	    
	    Panelpass.add(Labelpass);
	    Panelpass.add(Textpass);   
	    PanelButtons.add(Buttlog);
	    PanelButtons.add(Buttreg);
	    PanelButtons.add(ButtFget);
	    
	    b.add(Panelusr);
	    b.add(Panelpass);
	    b.add(PanelButtons);
	    
	    this.add(b);   
	    this.setContentPane(b);	    
	    this.setVisible(true);
	}
	private String turnCharsToString(char[] chars){
		  StringBuffer strBuf = new StringBuffer();
		  for (int i = 0; i < chars.length; i++) {
		   strBuf.append(chars[i]);
		  }
		  return strBuf.toString().trim();//trim去掉前后空白
    }//将密码框内容转成字符串
	public String Getusrname() {return Textusr.getText();}
	public String Getpassword() {return turnCharsToString(Textpass.getPassword());}


}




