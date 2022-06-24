package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBClass {
	//연결이 이루어진 객체
	Connection con;
	
	//쿼리문 전송을 하기 위한 전송 객체
	PreparedStatement ps;
	
	//select의 결과 값을 받기 위한 객체
	ResultSet rs;
	
	public DBClass() {
		System.out.println("생성자 실행");
		try {
			//자바에서 오라클 명령어를 수행하기 위한 기능을 등록하는 과정
			Class.forName(
					"oracle.jdbc.driver.OracleDriver");
			//오라클 연결하는 과정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url,"java2","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int insert(Info info) {
		String sql="insert into newst values(?, ?, ?)";
		
		int result = 0;
		
		try {
			//연결된 객체를 이용해서 명령어 전송객체를 얻어온다
			ps = con.prepareStatement(sql);
			ps.setString(1, info.getId());
			ps.setString(2, info.getName());
			ps.setInt(3, info.getAge());
			
			//명령어를 전송하겠다는 의미이다
			//executeUpdate 보통 select를 제외한 나머지에 사용
			//성공이면 1, 실패면 0 또는 에러
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public Info selectOne(String id) {
		String sql = 
				"select * from newst where id='"+id+"'";
		Info info = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				info = new Info();
				info.setId(rs.getString("id"));
				info.setName(rs.getString("name"));
				info.setAge(rs.getInt("age"));
				//System.out.println(rs.getString("id"));
				//System.out.println(rs.getString("name"));
				//System.out.println(rs.getInt("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return info;
	}
	public ArrayList<Info> select() {
		String sql = "select * from newst";
		ArrayList<Info> list = new ArrayList<Info>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Info info = new Info();
				info.setId(rs.getString("id"));
				info.setName(rs.getString("name"));
				info.setAge(rs.getInt("age"));
				list.add(info);
				
				//System.out.println(rs.getString("id"));
				//System.out.println(rs.getString("name"));
				//System.out.println(rs.getInt("age"));
				//System.out.println("------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
