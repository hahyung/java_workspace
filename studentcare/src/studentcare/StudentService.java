package studentcare;

public interface StudentService {
	public void saveWorker(StudentDTO dto); //특정 학생 등록 메소드
	public void delete(String phNum); //특정 학생 삭제 메소드
	public StudentDTO  search(String name); //특정 학생 검색 메소드
	public void output(); //모든 학생 출력 메소드
	
}
