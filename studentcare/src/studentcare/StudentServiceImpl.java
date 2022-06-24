package studentcare;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {
	
	StudentDTO dto = new StudentDTO();
	private ArrayList<StudentDTO> arr;
	
	public StudentServiceImpl() { arr = new ArrayList<StudentDTO>();}

	@Override
	public void saveWorker(StudentDTO dto) {
		// TODO Auto-generated method stub
			arr.add(dto);
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
			}
			System.out.println("====== SystemMessage =====");
			System.out.println(dto.getName() +"님의 "+ "나이: "+ dto.getAge() + " 전화번호: "+ dto.getPhNum()+"이(가) 등록 되었습니다.");
	}

	@Override
	public void delete(String phNum) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.size(); i++) {
			dto = arr.get(i);
			if(phNum.equals(dto.getPhNum())) {
				arr.remove(i);
				System.out.println("=======삭제되었습니다=======");
			}
		}
	}

	@Override
	public StudentDTO search(String name) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.size(); i++) {
			dto = arr.get(i);
			if(name.equals(dto.getName())) {
				System.out.println("=======개인 정보 열람=======");
				System.out.println("이름 : " + dto.getName() + ""
						+ "\t나이 : " + dto.getAge() + ""
						+ "\n전화번호 : " + dto.getPhNum() + ""
						+ "\t주소 : " + dto.getAddr());			}
		}
		return null;
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("모든 학생을 출력합니다.");
		if(arr.size()>=0) {
			for(int i=0; i<arr.size(); i++) {
				dto = arr.get(i);
				System.out.println("=======정보 호출=======");
				System.out.println("이름 : " + dto.getName() + ""
						+ "\t나이 : " + dto.getAge() + ""
						+ "\n전화번호 : " + dto.getPhNum() + ""
						+ "\t주소 : " + dto.getAddr());
			}
		}
	}
	
}
