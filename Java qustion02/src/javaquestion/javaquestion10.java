package javaquestion;
import java.util.Scanner;
public class javaquestion10 {
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
 int a =s.nextInt();
 int b =s.nextInt();
 double c =s.nextDouble();
 System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
 int x = s.nextInt();
 int y = s.nextInt();
 double z = s.nextDouble();
 double result = Math.sqrt(((a-x)*(a-x))+((b-y)*(b-y)));

 if(result <= c+z) {
     System.out.print("�� ���� ���� ��ģ��.");
  }
  else {
     System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
}
}
}
