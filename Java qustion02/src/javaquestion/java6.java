package javaquestion;
import java.util.Scanner;
public class java6 {

	public static void main(String[] args) {
	//3,6,9 ��¹� 3,6,9�� �ϳ������� "�ڼ�¦"�� 3,6,9�� 2���� ������ "�ڼ�¦¦"�� ����Ѵ�.
		
	Scanner s = new Scanner(System.in);
	System.out.print("1~99������ ������ �Է��ϼ���>>");
	int a = s.nextInt();
    
	if((a/10==3&&a%10==3)||(a/10==3&&a%10==6)||(a/10==3&&a%10==9)||
	   (a/10==6&&a%10==3)||(a/10==6&&a%10==6)||(a/10==6&&a%10==9)||
	   (a/10==9&&a%10==3)||(a/10==9&&a%10==6)||(a/10==9&&a%10==9))
	{
		System.out.print("�ڼ�¦¦");
		
	}
	else if((a%10==3)||(a%10==6)||(a%10==9)||(a/10==3)||(a/10==6)||(a/10==9))
	{
		System.out.print("�ڼ�¦");
	}
	else
	{
		System.out.print("�ƹ��͵� �ƴϴ�");
	}

	}

}
