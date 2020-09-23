package com.revature.generic.arraylist;

import java.util.Arrays;

/*
 * For this activity, simply implement
 * all of the below methods!
 */
public class ArrayList<T> {
	private T[] arr;
	private int count;
	
	public ArrayList() {
		arr = (T[])new Object[10];
		count = 0;
	}

	// Add some generic item to some our list
	// The list is represented by the array
	public void add(T t) {
		// We can use count to tell where our list ends
		if (count < arr.length) {
			arr[count] = t;
			++count;
		} else {
			// 1. Create a new array of size arr.length*2
			
			T[] newArr = (T[])new Object[arr.length*2];
			
			// 2. Copy arr into new array
			for (int i = 0; i < arr.length; ++i) {
				newArr[i] = arr[i];
			}
			arr = newArr;
			
			// 3. Add our item
			add(t);
		}
	}
	
	public T get(int i) {
		return arr[i];
	}
	
	public int size() {
		return arr.length;
	}
	
	public int count() {
		return count;
	}
	
	/*
	 * Split should take arr and split into a number of subarrays.
	 * The number is given by numberOfNewArrays.
	 * 
	 * eg if [1, 5, 6, 5, 7] and input 3
	 * so the output would be: 
	 * [
	 *   [1, 5],
	 *   [6, 5],
	 *   [7, null]
	 * ]
	 */
	
	
	
	// 3. Return the array
	public T[][] split(int numberOfNewArrays) {
		// 1. Make a new array of size numberOfNewArrays
		//	   - Should be array of arrays
		//     - Each subarray should contain length/numberOfnewArrays elements
		int newSize;
		if (count % numberOfNewArrays == 0)
			newSize = count/numberOfNewArrays;
		else
			newSize = (count/numberOfNewArrays) + 1;
		
		T[][] returnVal = (T[][])new Object[numberOfNewArrays][newSize];
		
		// 2. Use a for loop to copy elements into the new arrays
		int currentIndex = 0;
		for (int i = 0; i < returnVal.length; ++i) {
			for (int j = 0; j < returnVal[i].length; ++j) {
				if (currentIndex >= count)
					break;
				
				returnVal[i][j] = arr[currentIndex];
				++currentIndex;
			}
		}
		
		return returnVal;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; ++i) {
			sb.append(arr[i]);
			
			if (i + 1 < arr.length)
				sb.append(", ");
		}
		
		return sb.toString();
	}
}
