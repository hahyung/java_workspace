package care_lab;

import java.util.ArrayList;

public class CompanyServiceImpl implements CompanyService {
	
	CompanyDTO dto = new CompanyDTO();
	private ArrayList<CompanyDTO> arr;
	
	public CompanyServiceImpl() { arr =  new ArrayList<CompanyDTO>();}
	@Override
	public void saveWorker(CompanyDTO dto) {
		// TODO Auto-generated method stub
		if(dto.getGrade().equals("����")) {
			dto.setSalary(300);
			dto.setTariff(0.01);
		}else if(dto.getGrade().equals("����")){
			dto.setSalary(400);
			dto.setTariff(0.02);
		}else if(dto.getGrade().equals("å��")){
			dto.setSalary(600);
			dto.setTariff(0.03);
		}
		if(dto.getGrade().equals("����")) {
			arr.add(dto);
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
			}
			System.out.println("====== SystemMessage =====");
			System.out.println(dto.getName() +"��! "+ dto.getGrade() + "���� ��� �Ǽ̽��ϴ�.");
		}else if(dto.getGrade().equals("����")) {
			arr.add(dto);
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
			}
			System.out.println("====== SystemMessage =====");
			System.out.println(dto.getName() +"��! "+ dto.getGrade() + "���� ��� �Ǽ̽��ϴ�.");
		}else if(dto.getGrade().equals("å��")) {
			arr.add(dto);
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
			}
			System.out.println("====== SystemMessage =====");
			System.out.println(dto.getName() +"��! "+ dto.getGrade() + "���� ��� �Ǽ̽��ϴ�.");
		}else{
			System.err.println("���� �Է� ����! �ٽ� �Է����ּ���.");
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
				System.out.println("=======���� ���� ȣ��=======");
				System.out.println("�̸� : " + dto.getName() + ""
						+ "\t���� : " + dto.getGrade() + ""
						+ "\n�޿� : " + dto.getSalary() + ""
						+ "\t���� : " + dto.getTariff());			}
		}
		return null;
	}
	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("��� ����� ����մϴ�.");
		if(arr.size()>=0) {
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
				System.out.println("=======���� ȣ��=======");
				System.out.println("�̸� : " + dto.getName() + ""
						+ "\t���� : " + dto.getGrade() + ""
						+ "\n�޿� : " + dto.getSalary() + ""
						+ "\t���� : " + dto.getTariff());
			}
		}
	}
	
	
		
}
