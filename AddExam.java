import java.util.Scanner;

public class AddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
	System.out.println("���� ����:");
	Scanner a = new Scanner(System.in);
	int c = a.nextInt();
	System.out.println("������ ����:");
	Scanner b = new Scanner(System.in);
	int d = b.nextInt();
	for(int i=c ; i<=d ;i++) {
		sum=sum+i;
	}
	System.out.println(c+"���� "+d+"������ ����"+sum+"�Դϴ�");
	}
	}

