package Control;

public class ClientInfo {
    private static String ClientName;
    public static void Set_ClientName(String n){
    	ClientName=n;
    }
    public static String Get_ClientName(){
    	return ClientName;
    }
}
