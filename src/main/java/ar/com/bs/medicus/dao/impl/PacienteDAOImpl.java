package ar.com.bs.medicus.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.bs.medicus.dao.PacienteDAO;
import ar.com.bs.medicus.dto.PacienteDTO;
import ar.com.bs.medicus.dto.PlanMedicoDTO;

public class PacienteDAOImpl implements PacienteDAO {
	private List<PacienteDTO> pacientes;	
	
	
	public PacienteDAOImpl() {
		super();
		pacientes= new ArrayList<PacienteDTO>();
		pacientes.add(new PacienteDTO(1, "Lopez", "Kk", "DNi", "37586236", "Calle 60", "911", "emailfalso@gmail.com", new Date(), "M", "Soltero", 2, new PlanMedicoDTO(), 12912, false, new Date()));
		pacientes.add(new PacienteDTO(2, "Lopez", "Kk", "DNi", "37586236", "Calle 60", "911", "emailfalso@gmail.com", new Date(), "M", "Soltero", 2, new PlanMedicoDTO(), 12912, false, new Date()));
		pacientes.add(new PacienteDTO(3, "Lopez", "Kk", "DNi", "37586236", "Calle 60", "911", "emailfalso@gmail.com", new Date(), "M", "Soltero", 2, new PlanMedicoDTO(), 12912, false, new Date()));
	}

	@Override
	public PacienteDTO create(PacienteDTO t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void saveOrUpdate(PacienteDTO entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public PacienteDTO find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PacienteDTO update(PacienteDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PacienteDTO> getAll() {
		return pacientes;
	}

}
