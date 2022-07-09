package Java02;
import java.util.Scanner;
public class javaquestion2 {
	//2자리수 정수를 입력해 10의자리와 1의자리가 같으면 문구출력하기

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("2자리수 정수 입력>>");
		int b = a.nextInt();
		if(b/10==b%10)
		{
		  System.out.print("Yes! 10의자리와 1의 자리가 같습니다");	
		}
		else
		{
			System.out.print("No! 10의자리와 1의 자리가 같지않습니다");
		}

	}

}
