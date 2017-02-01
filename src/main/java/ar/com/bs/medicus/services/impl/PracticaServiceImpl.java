package ar.com.bs.medicus.services.impl;

import java.util.ArrayList;
import java.util.List;


import ar.com.bs.medicus.dto.PracticaDTO;
import ar.com.bs.medicus.pojo.Practica;
import ar.com.bs.medicus.services.PracticaService;
import ar.com.osde.academia.backend.bo.LibroBO;
import ar.com.osde.academia.backend.services.impl.BusinessException;
import ar.com.osde.academia.backend.services.impl.Libro;
import ar.com.osde.academia.backend.services.impl.LibroDTO;

public class PracticaServiceImpl implements PracticaService  {
	private Practica Practica = null;
	@Override
	/**
	 * Listo las practicas
	 */
	public ArrayList<PracticaDTO> getAll() {
		List<PracticaDTO> libro = null;				
		return getDTO(Practica);
	}
	
	private ArrayList<PracticaDTO> getDTO (List<Practica> list){
		List<PracticaDTO> dto = new ArrayList<PracticaDTO>();
		for(Practica practica : list){
			
		}
		return dto;
	}
	
	
}
