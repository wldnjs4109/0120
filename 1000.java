import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B;
		Scanner a = new Scanner (System.in);
		A = a.nextInt();
		B = a.nextInt();
		
		if(A>0&&B<10) {
		System.out.println(A+B);
		}
		else {
			System.out.println("X");
		}
	}

}
