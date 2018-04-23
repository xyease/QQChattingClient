package Control;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CommonClass.CommandIndex;
import CommonClass.Usr;
import ConmunicationToS.RegisterToS;
import view.Login;
public class Login_Control extends Login  implements ActionListener{
	public Login_Control(){
		Buttreg.addActionListener(this);
		Buttlog.addActionListener(this);
		ButtFget.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent event) {
		String usrname=null;
		String password=null;
		
		Button ClickButton=(Button)event.getSource();
		if(ClickButton==Buttreg) {
			usrname=Getusrname();
			password=Getpassword();
			if(usrname==""||password=="") {
				JOptionPane.showMessageDialog(null,"Please enter complete message!",null,JOptionPane.ERROR_MESSAGE);
			}
			else {
				//System.out.println(usrname+password);
				Usr user=new Usr(CommandIndex.Register,usrname,password);
				RegisterToS.registerToS(user);				
			}
		}
		else if(ClickButton==Buttlog){
			if(usrname==""||password=="") {
				JOptionPane.showMessageDialog(null,"Please enter complete message!",null,JOptionPane.ERROR_MESSAGE);
			}
			else {
				
			}
			
		}
	}

}
