package care_lab;

public interface CompanyService {
	public void saveWorker(CompanyDTO dto); //Ư�� ��� ��� �޼ҵ�
    public void modify(CompanyDTO dto); //Ư�� ����� ����,�⺻��,���� ���� �޼ҵ�
    public CompanyDTO search(String nae); //Ư�� ��� �˻�. �̸� �� ���� �ش� ���� ���� ���� ã���� ��� ���� main���� ����Ѵ�.
    //���
    public void output(); //��� ��� ���
}
