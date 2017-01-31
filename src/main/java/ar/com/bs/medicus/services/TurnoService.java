package ar.com.bs.medicus.services;

import java.util.List;

import javax.jws.WebService;

import org.hibernate.service.Service;

import ar.com.bs.medicus.dto.TurnoDTO;

@WebService
public interface TurnoService extends Service{

	/**
	 * Recupera todos los turnos.
	 * @return
	 */
	List<TurnoDTO> getAll();
	
	/**
	 * Crea un turno.
	 * @param entity
	 */
	void create(TurnoDTO dto);
	
	/**
	 * Actualiza un turno.
	 * @param entity
	 */
	void update(TurnoDTO dto);
	
	/**
	 * Elimina un turno.
	 * @param entity
	 */
	void delete(TurnoDTO dto);
	
}
