package javaquestion;
import java.util.Scanner;
public class java9 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
	double z;
	System.out.print("���� �߽ɰ� ������ �Է�>>");
	int a = s.nextInt();
	int b = s.nextInt();
	double r;
	double result;
	System.out.print("�� �Է�>>");
	double x = s.nextDouble();
	double y = s.nextDouble();
	//��(x2-x1)2 + (y2-y1)2 
	z = (a-x)*(a-x) + (b-y)*(b-y);
	result = Math.sqrt(z);
//	if(result <= r)
//	{
//		
//	}
}
}
