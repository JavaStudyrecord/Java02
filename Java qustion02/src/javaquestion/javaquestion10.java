package javaquestion;
import java.util.Scanner;
public class javaquestion10 {
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.print("첫번째 원의 중심과 반지름 입력>>");
 int a =s.nextInt();
 int b =s.nextInt();
 double c =s.nextDouble();
 System.out.print("두번째 원의 중심과 반지름 입력>>");
 int x = s.nextInt();
 int y = s.nextInt();
 double z = s.nextDouble();
 double result = Math.sqrt(((a-x)*(a-x))+((b-y)*(b-y)));

 if(result <= c+z) {
     System.out.print("두 원은 서로 겹친다.");
  }
  else {
     System.out.print("두 원은 서로 겹치지 않는다.");
}
}
}
