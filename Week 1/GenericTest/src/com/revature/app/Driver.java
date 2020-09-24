package com.revature.app;

import com.revature.generic.list.GenericList;
import com.revature.generic.list.GenericList.Iterator;

public class Driver {
	public static void main(String[] args) {
		GenericList<String> lst = new GenericList<String>();
		lst.insertEnd("Hidey");
		lst.insertEnd("ho,");
		lst.insertEnd("neighborino!");
		
		Iterator i = lst.getIterator();
		while(i.hasNext()) {
			System.out.println(i.getData());
			i.next();
		}
	}
}
