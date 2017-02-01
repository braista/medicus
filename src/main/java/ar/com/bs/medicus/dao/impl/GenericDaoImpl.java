package ar.com.bs.medicus.dao.impl;

import ar.com.bs.medicus.dao.GenericDAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDaoImpl<T> implements GenericDAO<T> {
	
	@PersistenceContext
	protected EntityManager em;
	public Set<T> objects = new HashSet<T>();

	private Class<T> type;

	@Override
	public T create(final T t) {
		this.em.persist(t);
		return t;
	}

	@Override
	public void delete(final Object id) {
		this.em.remove(this.em.getReference(type, id));
	}

	@Override
	public T find(final Object id) {
		return (T) this.em.find(type, id);
	}

	@Override
	public T update(final T t) {
		return this.em.merge(t);
	}
	
	@Override
    public List<T> getAll() {
        return new ArrayList<T>(objects);
    }
}