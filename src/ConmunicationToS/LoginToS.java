package ConmunicationToS;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import CommonClass.Datagram;
import CommonClass.Flag;
import Control.ClientInfo;

public class LoginToS {
    public static void Login_To_S(Datagram usr) {
    	ObjectInputStream ois=MainControl.connect.GetIos();
        ObjectOutputStream oos=MainControl.connect.GetOoS();
        try {
            oos.writeObject(usr);
            Datagram response=(Datagram)ois.readObject();
            if(response.GetFlag()==Flag.Success){
                 System.out.println("Login Successfully!");
                 ClientInfo.Set_ClientName(usr.GetName());
                 MainControl.com.DisposeLwindow();
                 MainControl.com.CreateFwindow();          
            }
            else if(response.GetFlag()==Flag.Failed) JOptionPane.showMessageDialog(null,"Login Failed!",null,JOptionPane.ERROR_MESSAGE);
            else if(response.GetFlag()==Flag.IllegalUsrName) JOptionPane.showMessageDialog(null,"Illegal UsrName!",null,JOptionPane.ERROR_MESSAGE);
            else JOptionPane.showMessageDialog(null,"Error password!",null,JOptionPane.ERROR_MESSAGE);
         }catch(IOException e) {
         	e.printStackTrace();
         }catch(ClassNotFoundException e) {
         	e.printStackTrace();
         }
    }
}
