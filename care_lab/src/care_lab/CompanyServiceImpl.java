package care_lab;

import java.util.ArrayList;

public class CompanyServiceImpl implements CompanyService {
	
	CompanyDTO dto = new CompanyDTO();
	private ArrayList<CompanyDTO> arr;
	
	public CompanyServiceImpl() { arr =  new ArrayList<CompanyDTO>();}
	@Override
	public void saveWorker(CompanyDTO dto) {
		// TODO Auto-generated method stub
		if(dto.getGrade().equals("인턴")) {
			dto.setSalary(300);
			dto.setTariff(0.01);
		}else if(dto.getGrade().equals("선임")){
			dto.setSalary(400);
			dto.setTariff(0.02);
		}else if(dto.getGrade().equals("책임")){
			dto.setSalary(600);
			dto.setTariff(0.03);
		}
		if(dto.getGrade().equals("인턴")) {
			arr.add(dto);
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
			}
			System.out.println("====== SystemMessage =====");
			System.out.println(dto.getName() +"님! "+ dto.getGrade() + "으로 등록 되셨습니다.");
		}else if(dto.getGrade().equals("선임")) {
			arr.add(dto);
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
			}
			System.out.println("====== SystemMessage =====");
			System.out.println(dto.getName() +"님! "+ dto.getGrade() + "으로 등록 되셨습니다.");
		}else if(dto.getGrade().equals("책임")) {
			arr.add(dto);
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
			}
			System.out.println("====== SystemMessage =====");
			System.out.println(dto.getName() +"님! "+ dto.getGrade() + "으로 등록 되셨습니다.");
		}else{
			System.err.println("직급 입력 오류! 다시 입력해주세요.");
		}
	}
	@Override
	public void modify(CompanyDTO dto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public CompanyDTO search(String nae) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.size(); i++) {
			dto = arr.get(i);
			if(nae.equals(dto.getName())) {
				System.out.println("=======개인 정보 호출=======");
				System.out.println("이름 : " + dto.getName() + ""
						+ "\t직급 : " + dto.getGrade() + ""
						+ "\n급여 : " + dto.getSalary() + ""
						+ "\t세액 : " + dto.getTariff());			}
		}
		return null;
	}
	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("모든 사원을 출력합니다.");
		if(arr.size()>=0) {
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
				System.out.println("=======정보 호출=======");
				System.out.println("이름 : " + dto.getName() + ""
						+ "\t직급 : " + dto.getGrade() + ""
						+ "\n급여 : " + dto.getSalary() + ""
						+ "\t세액 : " + dto.getTariff());
			}
		}
	}
	
	
		
}
