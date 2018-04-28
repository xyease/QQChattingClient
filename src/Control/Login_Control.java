package Control;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import CommonClass.CommandIndex;
import CommonClass.Datagram;
import ConmunicationToS.ConnectToServer;
import ConmunicationToS.LoginToS;
import ConmunicationToS.RegisterToS;
import view.Login;
public class Login_Control extends Login  implements ActionListener{
	public Login_Control() {
		Buttreg.addActionListener(this);
		Buttlog.addActionListener(this);
		ButtFget.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event) {
		String usrname=null;
		String password=null;
		usrname=Getusrname();
		password=Getpassword();
		Button ClickButton=(Button)event.getSource();
		if(ClickButton==Buttreg) {
			if(usrname==""||password=="") {
				JOptionPane.showMessageDialog(null,"Please enter complete message!",null,JOptionPane.ERROR_MESSAGE);
			}
			else {
				Datagram usr=new Datagram(CommandIndex.Register,usrname,password);
				RegisterToS.registerToS(usr);				
			}
		}
		else if(ClickButton==Buttlog){
			if(usrname==""||password=="") {
				JOptionPane.showMessageDialog(null,"Please enter complete message!",null,JOptionPane.ERROR_MESSAGE);
			}
			else {
				Datagram usr=new Datagram(CommandIndex.Login,usrname,password);
				LoginToS.Login_To_S(usr);
			}
			
		}
	}

}
