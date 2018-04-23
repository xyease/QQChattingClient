package ConmunicationToS;

import java.io.IOException;

import Control.Login_Control;

public class MainControl {
	public static ConnectToServer connect=null;
    public static void main(String[] args) {  	  
  	  try {
      connect=new ConnectToServer();
      Login_Control window=new Login_Control();
      connect.CloseLink();
  	  }catch(IOException e) {
  		  e.printStackTrace();
  	  }
  	  
    }
}
