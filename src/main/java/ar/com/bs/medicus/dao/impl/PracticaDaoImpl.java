package ar.com.bs.medicus.dao.impl;

import java.util.List;


import ar.com.bs.medicus.dao.PracticaDAO;
import ar.com.bs.medicus.dto.PracticaDTO;


public class PracticaDAOImpl implements PracticaDAO {
	
	private List<PracticaDTO> practicas;
	
	public PracticaDAOImpl() {					
		super();
	}
	
	/** solo usa este metodo 
	 * 	
	 */
	public List<PracticaDTO> getAll() {
		return practicas;
		
	}


	@Override
	public PracticaDTO create(PracticaDTO t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void saveOrUpdate(PracticaDTO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public PracticaDTO find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PracticaDTO update(PracticaDTO t) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	
}
