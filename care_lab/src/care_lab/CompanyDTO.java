package care_lab;

public class CompanyDTO {
	private String name, grade;
	private int salary;
	private double tariff;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getSalary() {
		return salary;
	}
	public double getTariff() {
		return tariff;
	}
}