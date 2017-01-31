package ar.com.bs.medicus.services;

import java.util.ArrayList;

import org.hibernate.service.Service;

import ar.com.bs.medicus.dto.PracticaDTO;



public interface PracticaService extends Service {
 
	/**
	 * Solo Listo las practicas,ya que solo se pueden consultar
	 * @return
	 */
	ArrayList<PracticaDTO> getAll();
}
