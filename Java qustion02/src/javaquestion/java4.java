package javaquestion;
import java.util.Scanner;
public class java4 {

	public static void main(String[] args) {
		//3개의 정수를 입력받아 중간값 출력하기
		Scanner d = new Scanner(System.in);
		System.out.print("정수 3개 입력>>>");
		int a = d.nextInt();
		int b = d.nextInt();
		int c = d.nextInt();
		
		if(((c<a)&&(a<b))||((b<a)&&(a<c)))
		{
			System.out.print("중간값은 "+a);
		}
	else if(((a<b)&&(b<c))||((c<b)&&(b<a)))
		{
			System.out.print("중간값은 "+b);
		}
	else if(((a<c)&&(c<b))||((b<c)&&(c<a)))
		{
			System.out.print("중간값은 "+c);
		}
		

	}

}
