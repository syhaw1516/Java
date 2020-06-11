import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		for(int i=0; i < arr.length; i++) {
 		System.out.print((i+1)+"번 입력:");
		Scanner scan =new Scanner(System.in);
		arr[i] = scan.nextInt();
		}
		int a=0;
		int max=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >= max){
                max = arr[i];
                a= i+1;
            }
        }
        System.out.println("가장 큰 정수는 "+a+"번째의 값인 "+max+"입니다.");
    }
}

