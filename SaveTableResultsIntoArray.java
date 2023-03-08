package TablesOperation;

import java.util.Arrays;

public class SaveTableResultsIntoArray {
	
	static int[] arr;

	public static void main(String[] args) {
		
		//idi input number
		int num = 5;
		
		//idi array creation
		arr = new int[10];//ee line avasarama ee line lekunda kudarada, avasarame endukante we can use this array in other progran too..
		//wait I'll show u
		
		
		for(int i=0; i<10; i++) {
			
			//ikkada result ni array lo store chestunnanu
			arr[i] = num * (i+1);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(getLength(arr));
		
	}
	
	public static int getLength(int[] array) {
		
		return array.length;
	}
}