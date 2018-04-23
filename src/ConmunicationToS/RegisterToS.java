package ConmunicationToS;
import CommonClass.Usr;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//import java.nio.file.attribute.UserPrincipalNotFoundException;
public class RegisterToS {
    public static void  registerToS(Usr user) {
        // 1.创建客户端的Socket，指定服务器的IP和端口
        try {
            Socket socket = new Socket("localhost",9999);          
            // 2.获取该Socket的输出流，用来向服务器发送信息
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(user);
            socket.shutdownOutput();
            //String infoString=null;          
            // 3.获取输入流，取得服务器的信息
            InputStream is = socket.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String info=br.readLine();
            //System.out.println(info);
            if(info.equals("Success")){
                System.out.println("Register Successfully!");
                
            }
            else if(info.equals("Failed")){
            	JOptionPane.showMessageDialog(null,"Register Failed!",null,JOptionPane.ERROR_MESSAGE);
            }
            else {
            	JOptionPane.showMessageDialog(null,"User name has been used!",null,JOptionPane.ERROR_MESSAGE);
            }
            socket.shutdownInput();
            oos.close();
            os.close();            
            br.close();
            is.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}  	

