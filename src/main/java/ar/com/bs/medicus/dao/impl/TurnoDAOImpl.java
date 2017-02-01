package ar.com.bs.medicus.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.bs.medicus.dao.TurnoDAO;
import ar.com.bs.medicus.dto.PacienteDTO;
import ar.com.bs.medicus.dto.PlanMedicoDTO;
import ar.com.bs.medicus.dto.PracticaDTO;
import ar.com.bs.medicus.dto.PrestadorDTO;
import ar.com.bs.medicus.dto.TurnoDTO;

public class TurnoDAOImpl implements TurnoDAO{

	private List<TurnoDTO> turnos;
	

	public TurnoDAOImpl() {
		turnos = new ArrayList<TurnoDTO>();
		PacienteDTO paciente = new PacienteDTO(1," marcos", "eme", "dni", "650", "calle"," 56456", "marcos@jfajfs", new Date(), "M", "estadoCivil", 10, new PlanMedicoDTO(), 55, false, new Date());
		PracticaDTO practica = new PracticaDTO();
		PrestadorDTO prestador = new PrestadorDTO();
		TurnoDTO turno = new TurnoDTO (1, 12, paciente , new Date(), new Date(), prestador, practica, new PlanMedicoDTO() , 2.3F, "asdasd");
		turnos.add(turno);

	}

	@Override
	public TurnoDTO create(TurnoDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(TurnoDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TurnoDTO find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TurnoDTO update(TurnoDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TurnoDTO> getAll() {
		
		// TODO Auto-generated method stub
		return turnos;
	}

}
