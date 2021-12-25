package flourPacker;

public class FlourPacker {

	public static boolean canPack(int bigCount,int smallCount,int goal) {
		if(bigCount <0 || smallCount< 0 || goal<0) {
			return false;
		}else if(bigCount*5+smallCount<goal) {
			
			return false;
		}else {
				bigCount*=5;
				int maxBig = goal/5;
				int min = goal%5;
					if (bigCount>=maxBig && smallCount>= min){
					return true;
					}else if (bigCount==0 && smallCount == goal ) {
						return true;
					}
				
	}
		return false;
}}