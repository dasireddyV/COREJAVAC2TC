import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pnBuffer {
	int n;
	void sign(int p) {
		n=p;
		if(n>0 && n!=0) {
			System.out.println("Given number is positive");
		}
		else {
			System.out.println("Given number is negative");
		}
	}

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		pnBuffer b=new pnBuffer();
		System.out.println("Enter a number:");
		try {
		b.n=Integer.parseInt(in.readLine());
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		b.sign(b.n);
	}

}
