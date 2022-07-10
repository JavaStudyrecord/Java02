package javaquestion;
import java.util.Scanner;
public class java1 {

public static void main(String[] args) {
	//돈 입력받아서 달력 구하기
		Scanner a = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 돈)>>>");
		int b = a.nextInt();
		System.out.print(b+"원은 $"+b/1100.0+"입니다");
		
	}

}
