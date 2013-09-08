public class Calculus {
	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner reader = new Scanner (System.in);
		int x = reader.nextInt();
		int n = 1;
		double sum = 1.0;

		double lessThan = Math.pow(10,-12);
		double term =7;
		int factorial =1;
		System.out.println("Limit value=" + lessThan);
		while (term>=lessThan) {
			factorial = 1;
			for (int k=1; k<=n; k++) {
				factorial = factorial *k;
			}
		}

		double ex=Math.pow(x,n);
		term = ex / factorial;
		sum = sum + term;
		System.out.println("n=" + n + "; Factorial= " + factorial + "; Term=" + term + "; Power= " + ex + "; Sum= " + sum);
		n++;
 	

	}
 } 
     