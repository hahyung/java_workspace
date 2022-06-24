package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 Map
 - 키와 값으로 하나의 쌍으로 이루어져 있다
 - 순서는 유지되지 않으며, 키와 중복은 허용하지 않는다
 */
public class Ex02 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		//        key     value
		map.put("선풍기", "100만원");
		map.put("에어컨", "50만원");
		map.put("자동차", "10만원");
		
		map.put("자동차", "1000만원");
		System.out.println(map);
		
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("자동차"));
		System.out.println(map.get("없는값"));
		
		System.out.println(map.containsKey("자동차")); //map.comtainsKey 해당하는 값이 존재하는지 여부 확인
		System.out.println(map.containsKey("ㅁㅁㅁ"));
		
		map.remove("선풍기");
		System.out.println(map);
		
		System.out.println(map.keySet()); //해당하는 키들만 가져올 수 있다
		
		//Set set = map.keySet();
		//Iterator it = set.iterator();
		Iterator it = map.keySet().iterator(); //위의 주석 두개를 한번에 작성한 것 
		//it = [bof, 자동차, 선풍기, eof]
		//map = {자동차:10만원, 선풍기:100만원}
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s+" : "+map.get(s));
		}
		
		String k="우리집", v="종로3가";
		map.put(k, v);
		
		Scanner input = new Scanner(System.in);
		System.out.println("찾을 값 입력");
		String search = input.next();
		if(map.get(search)==null) {
			System.out.println("존재하지 않는 주소");
		}else {
			System.out.println(
					search+" : "+map.get(search));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
