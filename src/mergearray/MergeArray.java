/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergearray;

import java.util.Arrays;

/**
 *
 * @author xristos
 */
public class MergeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int numbers[]=new int[8];
//initialization.
       numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
       int[] numbers2 = {2,5,7,8};
        System.out.println("\nArray1: "+Arrays.toString(numbers));  
	    System.out.println("\nArray2: "+Arrays.toString(numbers2));
		int m =4, n=4;
		int i = m-1, j = n-1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (numbers[i] > numbers2[j]) {
                numbers[index--] = numbers[i--];
            } else {
                numbers[index--] = numbers2[j--];
            }
        }
        while (i >= 0) {
            numbers[index--] = numbers[i--];
        }
        while (j >= 0) {
            numbers[index--] = numbers2[j--];
        }
 
    	System.out.println("Merged array: "+Arrays.toString(numbers));
    }
    
}
