package reverseArray;

import java.util.Arrays;


public class ReverseArray {
	
       
    private static void reverse(int[] array) {
    	
        System.out.println("Array = " + Arrays.toString(array));
        
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        
			/*
			 * for(int i = 0; i <= array.length - 1; i++){ for(int j = i + 1; j <=
			 * array.length - 1; j++){ if(array[j] > array[i]){ int tarolo = array[j];
			 * array[j] = array[i]; array[i] = tarolo; } }
			 */
    }System.out.println("Reversed array = " + Arrays.toString(array));
}}