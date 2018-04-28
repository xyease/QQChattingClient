package Control;

public class Component {
	private Login_Control Lwindow=null;
	private Friends_List_Control Fwindow=null;
	public void CreateLwindow() {
		Lwindow=new Login_Control(); 
	}
	public void CreateFwindow() {
		Fwindow=new Friends_List_Control();
	}
	public void DisposeLwindow() {
		Lwindow.setVisible(false);
	}
	public void DisposeFwindow() {
		Fwindow.dispose();
	}
}

