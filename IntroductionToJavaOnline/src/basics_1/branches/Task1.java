package basics_1.branches;

//1.Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Task1 {

	public static void main(String[] args) {
		double a = 45;
		double b = 45;
		if (a > 0 && b > 0 && (a + b) < 180) {
			if ((a + b) == 90 || a == 90 || b == 90) {
				System.out.println("Треугольник прямоугольный");
			}
			else {
				System.out.println("Треугольник существует, но он не прямоугольный");
			}	
		}
		
		else {
			System.out.println("Такого треугольника не существует");
		}
	}
}
