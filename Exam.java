import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[] =new int[5];
		int a,b;
		System.out.print("아동 수:");
		Scanner scan =new Scanner(System.in);
		M[0] = scan.nextInt();
		
		System.out.print("성인 수:");
		Scanner scan1 =new Scanner(System.in);
			M[1] = scan1.nextInt();
			a= M[0]+M[1];
		System.out.println("총수량:"+a);
			M[2] = a;
			b= M[0]*6000 + M[1]*8000;
		System.out.print("금액:"+ b);
			
		M[3] = b;
	}

}
