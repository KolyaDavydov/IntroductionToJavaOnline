package basics_1.linear_programs;

/*
6. ��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
����������� ����������� �������, � false � � ��������� ������:
*/

public class Task6 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		if((y <= 4 && y >= 0 & x <= 2 && x >= -2) || (y <= 0 && y >= -3 && x <= 4 & x >= -4)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
