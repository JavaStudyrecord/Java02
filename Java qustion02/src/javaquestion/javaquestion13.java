package javaquestion;
import java.util.Scanner;
public class javaquestion13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����>>");
		double a = s.nextDouble();
		String b =s.next();
		//���� ���ϸ� ���ڿ��� �ν���������
		double c = s.nextDouble();
		double d = a+c; 
		double f = a-c;
		double g = a*c;
		double h = a/c;
		double j = a%c;
		if(b.equals("+"))
		{
			System.out.println(a+" + "+c+" �� ��� ����� "+d);
		}
		else if(b.equals("-"))
		{
			System.out.println(a+" - "+c+" �� ��� ����� "+f);
		}
		else if(b.equals("*"))
		{
			System.out.println(a+" * "+c+" �� ��� ����� "+g);
		}
		else if(b.equals("/")&& ((a==0)||(c==0)))
		{
			System.out.println("0���� ���� �� �����ϴ�");
		}
		else if(b.equals("/"))
		{
			System.out.println(a+" / "+c+" �� ��� ����� "+h);
		}
		else if(b.equals("%"))
		{
			System.out.println(a+" % "+c+" �� ��� ����� "+j);
		}
	}

}
