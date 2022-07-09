package Java02;
import java.util.Scanner;
public class javequestion1 {

public static void main(String[] args) {
	//돈을 입력하면 원화로 바꿔주기
		Scanner a = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>>");
		int b = a.nextInt();
		System.out.print(b+"원은"+"$"+b/1100.0+"입니다");
		
	}

}
