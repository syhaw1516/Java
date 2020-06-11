import java.util.Scanner;

public class AddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
	System.out.println("시작 숫자:");
	Scanner a = new Scanner(System.in);
	int c = a.nextInt();
	System.out.println("마지막 숫자:");
	Scanner b = new Scanner(System.in);
	int d = b.nextInt();
	for(int i=c ; i<=d ;i++) {
		sum=sum+i;
	}
	System.out.println(c+"부터 "+d+"까지의 합은"+sum+"입니다");
	}
	}

