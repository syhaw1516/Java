import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("����,����,���� ������ 3���� ���� �Է�>>");
	Scanner a= new Scanner(System.in);
	Grade me= new Grade();
	me.math= a.nextInt();
	me.science= a.nextInt();
	me.english= a.nextInt();
	System.out.println("�����"+ me.average());
	}
}
class Grade{
	int math;
	int science;
	int english;
	
	public int average() {
		return(math+science+english)/3;
	}
}