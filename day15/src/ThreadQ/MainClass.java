package ThreadQ;


class login extends Thread {
	public void run() {
		FuncClass fc = new FuncClass();
		fc.login();
	}
}
/*
class time extends Thread {
	public void run() {
		FuncClass fc = new FuncClass();
		fc.frame();
	}
}
*/
public class MainClass {
	public static void main(String[] args) {
		
		login l = new login();
		//time t = new time();
		
		l.setDaemon(true); //������ ���ᰡ �Ǹ� �ٸ� Thread�� ����
		//t.setDaemon(true);
		
		l.start();
		//t.start();
		
		FuncClass fc = new FuncClass();
		//fc.time();
		fc.frame();
		
	}
}
