package studentcare;

public interface StudentService {
	public void saveWorker(StudentDTO dto); //Ư�� �л� ��� �޼ҵ�
	public void delete(String phNum); //Ư�� �л� ���� �޼ҵ�
	public StudentDTO  search(String name); //Ư�� �л� �˻� �޼ҵ�
	public void output(); //��� �л� ��� �޼ҵ�
	
}
