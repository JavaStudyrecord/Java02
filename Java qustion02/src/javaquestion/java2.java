package javaquestion;
import java.util.Scanner;
public class java2 {
	//2자리수의 정수를 입력받아 십의자리와 일의자리가 같은지 판별하여 출력하시오

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("2자리수 정수 입력>>");
		int b = a.nextInt();
		if(b/10==b%10)
		{
		  System.out.print("Yes! 10의 자리와 1의자리가 같습니다");	
		}
		else
		{
			System.out.print("No! 10의 자리와 1의자리가 같지않습니다");
		}

	}

}
