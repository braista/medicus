package ar.com.bs.medicus.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.service.Service;

import ar.com.bs.medicus.dao.PracticaDAO;
import ar.com.bs.medicus.dto.PracticaDTO;



public interface PracticaService extends Service {
 
	/**
	 * Solo Listo las practicas,ya que solo se pueden consultar
	 * @return
	 */
	List<PracticaDTO> getAll();
	
	 private PracticaDAO practicaDao; 
	  
	 public PracticaService() {
	    PracticaDao = new PracticaDAO();
	 } 
	
	public List<PracticaDTO> ListarPracticas() {
		  return practicaDao.ListarPracticas();
		 }
	
	
}
