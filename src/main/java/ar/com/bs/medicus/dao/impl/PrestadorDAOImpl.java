package ar.com.bs.medicus.dao.impl;

import java.util.List;

import ar.com.bs.medicus.dao.PrestadorDAO;
import ar.com.bs.medicus.dto.PrestadorDTO;

public class PrestadorDAOImpl implements PrestadorDAO {
	private List<PrestadorDTO> prestadores;
	
	public PrestadorDAOImpl(){
		super();
	}
	
	/*
	 * (non-Javadoc)
	 * @see ar.com.bs.medicus.dao.GenericDAO#getAll()
	 */
	public List<PrestadorDTO> getAll() {		
		return prestadores;
	}

	@Override
	public PrestadorDTO create(PrestadorDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(PrestadorDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PrestadorDTO find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrestadorDTO update(PrestadorDTO t) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
