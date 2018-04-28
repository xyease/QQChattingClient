package Control;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import CommonClass.CommandIndex;
import CommonClass.Datagram;
import ConmunicationToS.MainControl;
import view.Friend_Request;

public class Friend_Request_Control extends Friend_Request implements ActionListener{
    public Friend_Request_Control() {
    	BSend.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button ClickButton=(Button)e.getSource();
		if(ClickButton==BSend) {		
			String usr1=ClientInfo.Get_ClientName();
			String usr2=Getusrname();
			if(usr1.equals(usr2)) {
				JOptionPane.showMessageDialog(null,"You can't add yourself!",null,JOptionPane.ERROR_MESSAGE);
			}
			else {
			Datagram friendrequest=new Datagram(CommandIndex.FriendRequest,usr1);
			friendrequest.SetUsr2(usr2);		
	        ObjectOutputStream oos=MainControl.connect.GetOoS();
	          try{
	        	oos.writeObject(friendrequest);
	        	this.dispose();
	          }catch(IOException ex) {
	        	ex.printStackTrace();
	          }
			}
		}
	}

}
