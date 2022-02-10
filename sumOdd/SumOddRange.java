package sumOdd;

public class SumOddRange {

	public static boolean isOdd(int number) {
		if(number < 0 || (number%2)==0 ) {
			return false;
		} else {
			return true;
		}
		
		
	}
	
	public static int sumOdd(int start, int end) {
		if(start > end || start <=0 || end <=0) {
			return -1;
		}else {
			int sum=0;
			for(int i= start;i <= end; i++ ) {
				if(i%2 !=0) {
					sum= sum +i; 
				}
			}
			return sum;
		}
	}
}
