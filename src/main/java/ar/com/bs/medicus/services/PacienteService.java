package ar.com.bs.medicus.services;

import java.util.List;

import org.hibernate.service.Service;

import ar.com.bs.medicus.dto.PacienteDTO;

public interface PacienteService extends Service {
	
	public List<PacienteDTO> listPacientes();
}
