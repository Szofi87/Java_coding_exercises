package paintJob;

public class PaintJob {

	
	public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets) {
		
		if (width <=0 || height <=0 || areaPerBucket <= 0 || extraBuckets<0 ) {
			return -1;
		}else {
			double area= width*height;
			double db= area/areaPerBucket - extraBuckets;
			int count = (int) Math.ceil(db);
			return count;
		}
		
	}
public static int getBucketCount(double width, double height, double areaPerBucket) {
		
		if (width <=0 || height <=0 || areaPerBucket <= 0  ) {
			return -1;
		}else {
			double area= width*height;
			double db= area/areaPerBucket;
			int count = (int) Math.ceil(db);
			return count;
		}
		
	}
public static int getBucketCount(double area, double areaPerBucket) {
	
	if ( area <=0 || areaPerBucket <= 0 ) {
		return -1;
	}else {
		double db=0;
		db= area/areaPerBucket;
		int count = (int) Math.ceil(db);
		return count;
	}
	
}
	
	
	
}
