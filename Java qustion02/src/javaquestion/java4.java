package javaquestion;
import java.util.Scanner;
public class java4 {

	public static void main(String[] args) {
		//3���� ������ �Է¹޾� �߰��� ����ϱ�
		Scanner d = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>>");
		int a = d.nextInt();
		int b = d.nextInt();
		int c = d.nextInt();
		
		if(((c<a)&&(a<b))||((b<a)&&(a<c)))
		{
			System.out.print("�߰����� "+a);
		}
	else if(((a<b)&&(b<c))||((c<b)&&(b<a)))
		{
			System.out.print("�߰����� "+b);
		}
	else if(((a<c)&&(c<b))||((b<c)&&(c<a)))
		{
			System.out.print("�߰����� "+c);
		}
		

	}

}
