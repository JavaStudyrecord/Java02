package javaquestion;
import java.util.Scanner;
public class java5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int a =s.nextInt();
		int b =s.nextInt();
		int c =s.nextInt();
		if((a+b>c)&&(a+c>b)&&(b+c>a))
		{
			System.out.println("삼각형이 됩니다");
		}
		
	}

}
