
public class TeenNumberChecker {

	public static boolean hasTeen(int num1, int num2, int num3) {
		if(num1 >12 && num1 < 20) {
			return true;
		}else if(num2 >12 && num2 < 20) {
			return true;
		}else if(num3 >12 && num3 < 20) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isTeen(int num4) {
		if(num4 >12 && num4 < 20) {
			return true;
		} else {
			return false;
		}
	}
}
