package ConmunicationToS;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ConnectToServer {
	private Socket socket=null;
    OutputStream os;
    ObjectOutputStream oos;
    InputStream is;
    ObjectInputStream ios;
    public ConnectToServer() throws IOException{
    	  Socket socket = new Socket("localhost",9999); 
    	  os = socket.getOutputStream();
    	  oos = new ObjectOutputStream(os);
    	  is = socket.getInputStream();
    	  ios=new ObjectInputStream(is);  	
    }
    public ObjectInputStream GetIos() {return ios;}
    public ObjectOutputStream GetOoS() {return oos;}
    public void CloseLink() throws IOException{
    	if(ios!=null) ios.close();
    	if(is!=null) is.close();
    	if(oos!=null) oos.close();
    	if(os!=null) os.close();
    	if(socket!=null) socket.close();
    }
    
    // 2.��ȡ��Socket��������������������������Ϣ

    //oos.writeObject(user);
    //socket.shutdownOutput(); 
    //String infoString=null;          
    // 3.��ȡ��������ȡ�÷���������Ϣ
    // BufferedReader br=new BufferedReader(new InputStreamReader(is));
    //String info=br.readLine();

}
