import java.util.Scanner;

public class rightAnglePattern {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter limit");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(i);
			}
			System.out.println("\n");
		}
	}

}
