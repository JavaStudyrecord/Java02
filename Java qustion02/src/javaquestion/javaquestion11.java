package javaquestion;
import java.util.Scanner;
public class javaquestion11 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("���� �Է��ϼ���(1~12)>>>");
	int a = s.nextInt();
	if((a>=3)&&(a<=5))
	{
		System.out.print("��");
	}
	else if((a>=6)&&(a<=8))
	{
		System.out.print("����");
	}
	else if((a>=9)&&(a<=11))
	{
		System.out.print("����");
	}
	else if((a==1)||(a==2)||(a==12))
	{
		System.out.print("�ܿ�");
	}
	else
	{
		System.out.print("����");
	}
	

	}

}
