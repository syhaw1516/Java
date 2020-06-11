import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("수학,과학,영어 순으로 3개의 정수 입력>>");
	Scanner a= new Scanner(System.in);
	Grade me= new Grade();
	me.math= a.nextInt();
	me.science= a.nextInt();
	me.english= a.nextInt();
	System.out.println("평균은"+ me.average());
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