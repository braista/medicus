package ar.com.bs.medicus.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public interface GenericDao<T> {
	
    T create(T t);

    void delete(Object id);

    T find(Object id);

    T update(T t);
    
    public List<T> getAll();
}