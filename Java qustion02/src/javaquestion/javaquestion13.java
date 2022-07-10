package javaquestion;
import java.util.Scanner;
public class javaquestion13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연산>>");
		double a = s.nextDouble();
		String b =s.next();
		//띄어쓰기 안하면 문자열로 인식하지못함
		double c = s.nextDouble();
		double d = a+c; 
		double f = a-c;
		double g = a*c;
		double h = a/c;
		double j = a%c;
		if(b.equals("+"))
		{
			System.out.println(a+" + "+c+" 의 계산 결과는 "+d);
		}
		else if(b.equals("-"))
		{
			System.out.println(a+" - "+c+" 의 계산 결과는 "+f);
		}
		else if(b.equals("*"))
		{
			System.out.println(a+" * "+c+" 의 계산 결과는 "+g);
		}
		else if(b.equals("/")&& ((a==0)||(c==0)))
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		else if(b.equals("/"))
		{
			System.out.println(a+" / "+c+" 의 계산 결과는 "+h);
		}
		else if(b.equals("%"))
		{
			System.out.println(a+" % "+c+" 의 계산 결과는 "+j);
		}
	}

}
