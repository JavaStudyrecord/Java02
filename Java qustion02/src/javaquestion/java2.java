package javaquestion;
import java.util.Scanner;
public class java2 {
	//2�ڸ����� ������ �Է¹޾� �����ڸ��� �����ڸ��� ������ �Ǻ��Ͽ� ����Ͻÿ�

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�>>");
		int b = a.nextInt();
		if(b/10==b%10)
		{
		  System.out.print("Yes! 10�� �ڸ��� 1���ڸ��� �����ϴ�");	
		}
		else
		{
			System.out.print("No! 10�� �ڸ��� 1���ڸ��� �����ʽ��ϴ�");
		}

	}

}
