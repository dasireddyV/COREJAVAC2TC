import java.util.Scanner;

public class smallestNumber {
	int a,b,c;
	int small(int p,int q,int r) {
		p=a;
		q=b;
		r=c;
		if (p<q&&p<r) {
			return p;
		}
		else if(q<p&&q<r) {
			return q;
		}
		else {
			return r;
		}
	}

	public static void main(String[] args) {
		smallestNumber s=new smallestNumber();
		Scanner i=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		s.a=i.nextInt();
		s.b=i.nextInt();
		s.c=i.nextInt();
		System.out.println("smallest number is:"+s.small(s.a, s.b, s.c));
	}

}
