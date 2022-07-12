package javaquestion;
import java.util.Scanner;
public class java9 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
	double z;
	System.out.print("원의 중심과 반지름 입력>>");
	int a = s.nextInt();
	int b = s.nextInt();
	double r;
	double result;
	System.out.print("점 입력>>");
	double x = s.nextDouble();
	double y = s.nextDouble();
	//√(x2-x1)2 + (y2-y1)2 
	z = (a-x)*(a-x) + (b-y)*(b-y);
	result = Math.sqrt(z);
//	if(result <= r)
//	{
//		
//	}
}
}
