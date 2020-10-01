package com.revature.dao.interfaces;

import java.util.List;

public interface GenericDAO<T> {
	
	public void create(T t);
	
	public T get(int id);
	
	public void update(T t);
	
	public void delete(T t);
	
	public List<T> getAll();
}
