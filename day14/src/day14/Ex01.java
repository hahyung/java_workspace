package day14;
class DBconnect{
	private static DBconnect db;
	private static int cnt=0;
	private DBconnect() {cnt++;}
	public int getCnt() {return cnt;}
	public void controllDB() {
		System.out.println("db사용");
	}
	public static DBconnect getInstance() {
		if(db==null)
			db = new DBconnect();
		return db;
	}
}


public class Ex01 {
	public static void main(String[] args) {
		DBconnect db01 =  DBconnect.getInstance();
		DBconnect db02 =  DBconnect.getInstance();
		DBconnect db03 =  DBconnect.getInstance();
		DBconnect db04 =  DBconnect.getInstance();
		
		//DBconnect db01 = DBconnect.getInstance();
		System.out.println(db01);
		System.out.println(db02);
		System.out.println(db03);
		System.out.println(db04);
		
		//db01.controllDB();
		System.out.println(db01.getCnt() +"명 연결 되었습니다");
	}
}
