package com.revature.app;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class App {

	public static void main(String[] args) {
		
		List<Model> list = new Vector<Model>();
		list.add(new Model(17, "Peter"));
		list.add(new Model(5, "Jacob"));
		list.add(new Model(44, "Kevin"));
		
		Queue<Model> queue = new PriorityQueue<Model>();
		// queue.poll();
		
		Stack<Model> stack = new Stack<Model>();
		// stack.pop();
		
		//Collections.sort(list);
		Collections.sort(list, new ModelComparator());
		
		iterableStuff(list);
		
		Map<String, Model> map = new HashMap<String, Model>();
		Model m = map.get("horse");
		map.put("pig", m);
	}
	
	public static void iterableStuff(List<Model> list) {
		// We can access the iterator directly
		// and loop through the whole collection
		// ourselves
		Iterator<Model> it = list.iterator();
		while (it.hasNext()) {
			Model m = it.next();
			System.out.println(m.name);
		}
		
		// With Iterable implemented, we can also use
		// an "enhanced for loop" or "for-each loop"
		// which is read here as "for each Model m in list"
		for (Model m : list) {
			System.out.println(m.name + ", " + m.number);
		}
		
		// Finally, our forEach method, which we get from
		// Iterable as well. It takes a lambda, or anonymous
		// method, in the format of (parameters) -> { code }
		list.forEach( (Model m) -> {
			System.out.println("Inside lambda! " + m.name);
		});
	}
}

// In order to be sortable by Collections (the class), 
// we need to implement Comparable<T>
class Model implements Comparable<Model> {
	public int number;
	public String name;
	
	public Model(int number, String name) {
		this.number = number;
		this.name = name;
	}

	// We use compareTo to establish the "natural ordering"
	// of our objects, which is extremely useful in sorting
	// algorithms
	@Override
	public int compareTo(Model other) {
		// compareTo should return 0 for equal,
		// -1 for less than, and 1 for greater than
		
		if (number < other.number /*&& name.compareTo(other.name) < 0*/)
			return -1;
		else if (number > other.number /*&& name.compareTo(other.name) > 0*/)
			return 1;
		else return 0;
	}
}

// Comparator is handy when you dont want to use the class's
// compareTo, for example if you have special needs for your
// sorting
class ModelComparator implements Comparator<Model> {

	@Override
	public int compare(Model arg0, Model arg1) {
		return arg0.name.compareTo(arg1.name);
	}
	
}
