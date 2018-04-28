package ConmunicationToS;
import CommonClass.Datagram;
import CommonClass.Flag;
import Control.ClientInfo;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//import java.nio.file.attribute.UserPrincipalNotFoundException;
public class RegisterToS {
    public static void  registerToS(Datagram usr) {
        // 1.创建客户端的Socket，指定服务器的IP和端口
    	ObjectInputStream ois=MainControl.connect.GetIos();
        ObjectOutputStream oos=MainControl.connect.GetOoS();
        try {
           oos.writeObject(usr);
           Datagram response=(Datagram)ois.readObject();
           if(response.GetFlag()==Flag.Success){
                System.out.println("Register Successfully!");
                ClientInfo.Set_ClientName(usr.GetName());
                MainControl.com.DisposeLwindow();
                MainControl.com.CreateFwindow();          
           }
           else if(response.GetFlag()==Flag.Failed) JOptionPane.showMessageDialog(null,"Register Failed!",null,JOptionPane.ERROR_MESSAGE);
           else JOptionPane.showMessageDialog(null,"User name has been used!",null,JOptionPane.ERROR_MESSAGE);
        }catch(IOException e) {
        	e.printStackTrace();
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }
    }
}  	

