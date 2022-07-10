package javaquestion;
import java.util.Scanner;
public class java7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("점(x,y)의 좌표를 입력하시오>>>");
		int x = s.nextInt();
		int y = s.nextInt();
		if(((x>=100)&&(y<=200))&&((x<=200)&&(y>=100)))
		{
			System.out.print("점("+x+","+y+")는 사각형안에 있습니다");
		}
		else
		{
			System.out.print("점("+x+","+y+")는 사각형안에 없습니다");
		}

	}

}
