package basics_1.linear_programs;

//5.���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. �������
//������ �������� ������������ � �����, ������� � �������� � ��������� �����: ��� ����� SSc.

public class Task5 {

	public static void main(String[] args) {
		int t = 3659067;
		int hours = (int) (t / 3600);
		t = t - (hours * 3600);
		
		int minutes = (int) (t / 60);
		int seconds = t % 60;
		
		 System.out.println(hours + "� " + minutes + "��� " + seconds + "�");
	}

}
