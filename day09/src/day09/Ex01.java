package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 set
 - 순서를 유지하지 않는다
 - 중복된 값은 허용하지 않음
 */
public class Ex01 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); // 중복값 허용
		arr.add("홍길동"); arr.add("홍길동");
		System.out.println("arr : "+arr);
		
		HashSet hs = new HashSet(); // 중복값은 허용하지 않음
		hs.add("홍길동"); hs.add("김개똥");
		hs.add("홍길동");
		System.out.println(hs.remove("홍길동")); //삭제가 되면 true값이 나옴
		System.out.println("hs : "+hs);
		
		hs.add("홍길동");
		System.out.println(arr.get(0));
		//System.out.println(hs.get(0)); 순서가 없기 때문에 get을 사용할 수 없다
		
		//it = [bof,'홍길동','홍길동',eof] iterator 사용할 때 맨앞에는 무조건 bof 마지막엔 eof값이 들어간다
		//      it
		//            it
		//bof 는 여기서부터 시작한다 eof는 여기가 마지막이다 정도의 의미
		Iterator it = arr.iterator();
		while(it.hasNext()==true) {
			System.out.println(it.next());
		}
		/*
		System.out.println(it.hasNext()); //hasNext()는 현재 위치에서 다음값이 존재하는지 여부만 확인한다
		System.out.println(it.next()); // next를 만나는 순간 현재위치는 다음 위치로 이동하고 그 위치에 있던 값을 얻어온다
		
		System.out.println(it.hasNext()); 
		System.out.println(it.next());
		
		System.out.println(it.hasNext()); 
		*/
		
		it = hs.iterator();
		while(it.hasNext()==true) {
			Object s = it.next();
			String st = (String)s ;
			System.out.println(st);
		}
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
