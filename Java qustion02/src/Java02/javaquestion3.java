package Java02;
import java.util.Scanner;
public class javaquestion3 {
public static void main(String[] args) {
	//금액을 입력하여 금액마다 개수 분류하기
	
	Scanner a = new Scanner(System.in);
	System.out.print("금액을 입력하시오>>");
	int b = a.nextInt();
		
	System.out.println("오만원권 "+b/50000+"매");
	b%=50000;
	System.out.println("만원권 "+b/10000+"매");
	b%=10000;
	System.out.println("천원권 "+b/1000+"매");
	b%=1000;
	System.out.println("백원 "+b/100+"개");
	b%=100;
	System.out.println("오십원 "+b/10+"개");
	b%=10;
	System.out.println("십원 "+b/10+"개");
	b%=10;
	System.out.println("일원 "+b/1+"개");
	b%=1;
	
	
		
		
		
		
		
		
		

	}

}
