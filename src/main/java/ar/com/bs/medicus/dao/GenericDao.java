package ar.com.bs.medicus.dao;

import java.util.List;

public interface GenericDAO<T> {
	
	public T create(T t);

	void saveOrUpdate(T entity);
	
    public void delete(Object id);

    public T find(Object id);

    public T update(T t);
    
    public List<T> getAll();
}