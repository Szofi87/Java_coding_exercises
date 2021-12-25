package inputCalculator;

import java.util.Scanner;

public class InputCalc {

	
		
	
		  public static void main(String[] args){
		        int sum = 0, count = 0;
		         double rnd;
		        Scanner sc = new Scanner(System.in);
				
		       do {
		            boolean isInt = sc.hasNextInt();
		            if (isInt) {   
		            	
		            	int value = sc.nextInt();
		            	
		                sum += value;
		                count++;
		            } else if (count == 0){
		                System.out.println("SUM = 0 AVG = 0");
		                break;
		            } else {
		                rnd = (double) sum/count;
		                int avg = (int) Math.round(rnd);
		                
		                System.out.println("SUM = " + sum + " AVG = " + avg + "     " +rnd);
		                break;
		            }
		            sc.nextLine();
		        }while(true);
		        
		        sc.close();
		    }
		}
