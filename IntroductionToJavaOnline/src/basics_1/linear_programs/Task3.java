package basics_1.linear_programs;

/*
3.��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������)
*/

public class Task3 {

	public static void main(String[] args) {
		double x = 4.0;
		double y = 2.0;
		double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("�������� ��������� = " + result);
	}

}
