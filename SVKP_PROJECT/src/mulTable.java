import java.util.Scanner;

public class mulTable {

	public static void main(String[] args) {
		int n;
		Scanner in =new Scanner(System.in);
		System.out.println("enter a integer");
		n=in.nextInt();
		System.out.println("multiplication table for"+" "+n+" "+"is:");
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
