package com.revaure.app;

import com.revature.generic.arraylist.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<String> arlst = new ArrayList<String>();
		arlst.add("This");
		arlst.add("is");
		arlst.add("Spartaaa");
		
		for (int i = 0; i < arlst.count(); ++i) {
			System.out.println(arlst.get(i));
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
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(5);
		intList.add(6);
		intList.add(5);
		intList.add(7);
		
		Object[][] split = intList.split(3);
		
		for (int i = 0; i < split.length; ++i) {
			for (int j = 0; j < split[i].length; ++j) {
				System.out.print(split[i][j]);
				
				if (j + 1 < split[i].length)
					System.out.print(", ");
			}
			System.out.print("\n");
		}
	}
}
