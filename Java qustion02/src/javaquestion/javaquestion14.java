package javaquestion;
import java.util.Scanner;
public class javaquestion14 {
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.print("����>>");
	   double a = s.nextDouble();
	   String b = s.next(); 
	   double c = s.nextDouble();
	   switch(b) {
	   case "+":
		   System.out.print(a+"+"+c+" �� ��� ����� ");
		   System.out.print(a+c);
		   break;
	   case "-":
		   System.out.print(a+"-"+c+" �� ��� ����� ");
		   System.out.print(a-c);
		   break;
	   case "*":
		   System.out.print(a+"*"+c+" �� ��� ����� ");
		   System.out.print(a*c);
		   break;
	   case "/":
		   if((a==0)||(c==0))
		   {
			   System.out.println("0���� ������ �����ϴ�");
		   }
		   else
		   {
		   System.out.print(a+"/"+c+" �� ��� ����� ");
		   System.out.print(a/c);
		   }
		   break;
	   case "%":
		   System.out.print(a+"%"+c+" �� ��� ����� ");
		   System.out.print(a%c);
		   break;
		   default:
			   System.out.print("��Ģ������ �ɼ� �����ϴ�");
	   }
	   
}
}
