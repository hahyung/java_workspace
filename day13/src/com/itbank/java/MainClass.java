package com.itbank.java;

import java.util.*;
import com.itbank.kim.*; //다른 패키지에 있는 것들은 무조건 import가 필요, *은 모든값 사용


public class MainClass {
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.test();
		com.itbank.kim.TestClass t01 = new com.itbank.kim.TestClass();
		t01.t();
		
		TestClass01 tt01 = new TestClass01();
		tt01.test01();
		
	}
}
