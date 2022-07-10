package javaquestion;
import java.util.Scanner;
public class javaquestion14 {
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.print("연산>>");
	   double a = s.nextDouble();
	   String b = s.next(); 
	   double c = s.nextDouble();
	   switch(b) {
	   case "+":
		   System.out.print(a+"+"+c+" 의 계산 결과는 ");
		   System.out.print(a+c);
		   break;
	   case "-":
		   System.out.print(a+"-"+c+" 의 계산 결과는 ");
		   System.out.print(a-c);
		   break;
	   case "*":
		   System.out.print(a+"*"+c+" 의 계산 결과는 ");
		   System.out.print(a*c);
		   break;
	   case "/":
		   if((a==0)||(c==0))
		   {
			   System.out.println("0으로 나눌수 없습니다");
		   }
		   else
		   {
		   System.out.print(a+"/"+c+" 의 계산 결과는 ");
		   System.out.print(a/c);
		   }
		   break;
	   case "%":
		   System.out.print(a+"%"+c+" 의 계산 결과는 ");
		   System.out.print(a%c);
		   break;
		   default:
			   System.out.print("사칙연산이 될수 없습니다");
	   }
	   
}
}
