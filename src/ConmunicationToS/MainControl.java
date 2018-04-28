package ConmunicationToS;

import java.io.IOException;

import Control.Component;
//import Control.Login_Control;

public class MainControl {
	public static ConnectToServer connect=null;
	public static Component com=null;
    public static void main(String[] args) {  	  
  	  try {
  	  connect=new ConnectToServer();
      com=new Component(); 
      com.CreateLwindow();
     // connect.CloseLink();
  	  }catch(IOException e) {
  		  e.printStackTrace();
  	  }
  	  
    }
}
