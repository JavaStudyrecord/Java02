package javaquestion;
import java.util.Scanner;
public class javaquestion12 {
public static void main(String[] args) {
	
	
	//봄 여름 가을 겨울 Switch문
     Scanner s = new Scanner(System.in);
     System.out.print("달을 입력하세요(1~12)>>>");
     int a = s.nextInt();
     switch(a) {
     
     case 1:
     System.out.print("겨울");
     break;
     case 2:
     System.out.print("겨울");
     break;
     case 3:
     System.out.print("봄");
     break;
     case 4:
     System.out.print("봄");
     break;
     case 5:
     System.out.print("봄");
     break;
     case 6:
     System.out.print("여름");
     break;
     case 7:
     System.out.print("여름");
     break;
     case 8:
     System.out.print("여름");
     break;
     case 9:
     System.out.print("가을");
     break;
     case 10:
     System.out.print("가을");
     break;
     case 11:
     System.out.print("가을");
     break;
     case 12:
     System.out.print("겨울");
     break;
     default:
     System.out.print("아무것도아닙니다");
     break;
   } 
     }	
}

