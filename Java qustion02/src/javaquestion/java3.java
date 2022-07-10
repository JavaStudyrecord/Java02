package javaquestion;
import java.util.Scanner;
public class java3 {
public static void main(String[] args) {
	//돈을 입력받아 오만원, 만원, 천원, 500원, 100원, 50원, 1원으로 갯수 구분시키기 
	
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
	System.out.println("오십원 "+b/50+"개");
	b%=50;
	System.out.println("십원 "+b/10+"개");
	b%=10;
	System.out.println("일원 "+b/1+"개");
	b%=1;
	
	
		
		
		
		
		
		
		

	}

}
