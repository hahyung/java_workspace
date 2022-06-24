package day12;

public class TestClass04 {
	private int kor,eng,math,sum;
	private double avg;
	
	public void setNum(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void op() {
		sum = kor + eng + math;
		avg = sum/3.0;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return sum;
		
	}
	public double getAvg() {
		return avg;
		
	}
	
}
