package basics_1.linear_programs;

import java.math.RoundingMode;
import java.math.BigDecimal;

//4.���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). �������� �������
//������� � ����� ����� ����� � ������� ���������� �������� �����.

public class Task4 {

	public static void main(String[] args) {
		double r = 123.456;
		int first = (int) r;
		double last = r - first;
		double result = (last * 1000.000) + ((double) first / 1000.000);
		BigDecimal bd = new BigDecimal(Double.toString(result));
	    bd = bd.setScale(3, RoundingMode.HALF_UP);
	    result = bd.doubleValue();
		System.out.println("����� ����� ����� ���� � ���������� ����� ������: " + result);
		
	}

}
