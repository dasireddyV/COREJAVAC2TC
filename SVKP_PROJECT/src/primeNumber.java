
public class primeNumber {

	public static void main(String[] args) {
		int n=8;
		boolean isPrime = true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==true) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}

}
