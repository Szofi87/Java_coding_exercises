package lastDigitChecker;

public class LastDigitChecker {

	public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000)&& (thirdNumber >= 10 && thirdNumber <= 1000)) {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;
            
           
            if(thirdNumberLastDigit == firstNumberLastDigit || (thirdNumberLastDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberLastDigit) ) {
            	 return true;
            }else {
            	return false;
            }
           
        }
       
        return false;
    }
	
	public static boolean isValid(int param) {
		if(param >= 10 && param <= 1000) {
			return true;
		}else {
			return false;
		}
	}
}
