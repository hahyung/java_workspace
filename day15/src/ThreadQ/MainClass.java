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
		
		l.setDaemon(true); //메인이 종료가 되면 다른 Thread도 종료
		//t.setDaemon(true);
		
		l.start();
		//t.start();
		
		FuncClass fc = new FuncClass();
		//fc.time();
		fc.frame();
		
	}
}
