package javaquestion;
import java.util.Scanner;
public class javaquestion11 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("달을 입력하세요(1~12)>>>");
	int a = s.nextInt();
	if((a>=3)&&(a<=5))
	{
		System.out.print("봄");
	}
	else if((a>=6)&&(a<=8))
	{
		System.out.print("여름");
	}
	else if((a>=9)&&(a<=11))
	{
		System.out.print("가을");
	}
	else if((a==1)||(a==2)||(a==12))
	{
		System.out.print("겨울");
	}
	else
	{
		System.out.print("오류");
	}
	

	}

}
