package javaquestion;
import java.util.Scanner;
public class java8 {
	public static boolean inRect(int x,int y,int rectx1, int recty1, 
			int rectx2, int recty2)
	{
	if((x >=rectx1 && x<=rectx2)&&(y>=recty1&&y<=recty2))
	return true;
	else return false;
	}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	boolean a,b;
	System.out.print("x1,y1�� �Է��ϼ���>>");
	int x1 = s.nextInt();
	int y1 = s.nextInt();
	System.out.print("x2,y2�� �Է��ϼ���>>");
	int x2 = s.nextInt();
	int y2 = s.nextInt();
	if (inRect(x1,y1,100,100,200,200) ||
			inRect(x2,y2,100,100,200,200) ||
			inRect(x1,y2,100,100,200,200) ||
			inRect(x2,y1,100,100,200,200))
			System.out.println("�簢���� ��Ĩ�ϴ�.");
	else if ((inRect(x1,y1,100,100,200,200)) &&
			inRect(x2,y2,100,100,200,200) &&
			inRect(x2,y1,100,100,200,200) &&
			inRect(x1,y2,100,100,200,200))
	        System.out.println("�簢���� ��Ĩ�ϴ�.");
    else if ((inRect(100,100,x1,y1,x2,y2)) &&
		    inRect(100,200,x1,y1,x2,y2) &&
		    inRect(200,100,x1,y1,x2,y2) &&
		    inRect(200,200,x1,y1,x2,y2))
	        System.out.println("�簢���� ��Ĩ�ϴ�.");
    else
	        System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
            s.close();
}
}
   


