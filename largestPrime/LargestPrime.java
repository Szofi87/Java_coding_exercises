package largestPrime;

public class LargestPrime {

	public static int getLargestPrime(int number) {
		if (number == 0 || number ==1 || number <0) {
			return -1;
		}else {
			int i;
			 for (i = 2; i <= number; i++) {
		            if (number % i == 0) {
		                number /= i;
		                i--;
		            }
		        }

		        return i;
		    }
	}
}
