package minimumElement;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
    	 Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter number : ");
        int number = scanner.nextInt ();
        scanner.nextLine ();
        scanner.close();
        return number;
        
    }

    private static int[] readElements(int element){
    	 Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter " + element + " elements ");
        int [] array = new int[element];
        for (int i = 0; i < element;i++){
            array[i] = scanner.nextInt ();
            scanner.nextLine ();
        }
        scanner.close();
        return array;
    }

    private static int findMin(int array []){
        int minimumElement = array[0];
        for (int i = 0; i < array.length;i++){
            if (array[i] < minimumElement) {
                minimumElement = array[i];

            }
        }
        return minimumElement;
    }

}