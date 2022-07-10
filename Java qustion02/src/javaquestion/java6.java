package javaquestion;
import java.util.Scanner;
public class java6 {

	public static void main(String[] args) {
	//3,6,9 출력문 3,6,9가 하나있으면 "박수짝"을 3,6,9가 2개씩 있으면 "박수짝짝"을 출력한다.
		
	Scanner s = new Scanner(System.in);
	System.out.print("1~99사이의 정수를 입력하세요>>");
	int a = s.nextInt();
    
	if((a/10==3&&a%10==3)||(a/10==3&&a%10==6)||(a/10==3&&a%10==9)||
	   (a/10==6&&a%10==3)||(a/10==6&&a%10==6)||(a/10==6&&a%10==9)||
	   (a/10==9&&a%10==3)||(a/10==9&&a%10==6)||(a/10==9&&a%10==9))
	{
		System.out.print("박수짝짝");
		
	}
	else if((a%10==3)||(a%10==6)||(a%10==9)||(a/10==3)||(a/10==6)||(a/10==9))
	{
		System.out.print("박수짝");
	}
	else
	{
		System.out.print("아무것도 아니다");
	}

	}

}
