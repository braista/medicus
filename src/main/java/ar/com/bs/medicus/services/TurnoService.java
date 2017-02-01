package ar.com.bs.medicus.services;

import java.util.List;

import javax.jws.WebService;

import ar.com.bs.medicus.dto.TurnoDTO;
@WebService
public interface TurnoService{

	/**
	 * Recupera todos los turnos.
	 * @return
	 */
	List<TurnoDTO> getAll();
	
	TurnoDTO find(TurnoDTO turno);
	
	/**
	 * Crea un turno.
	 * @param entity
	 */
	void create(TurnoDTO dto);
	
	/**
	 * Actualiza un turno.
	 * @param entity
	 */
	void saveOrupdate(TurnoDTO dto);
	
	/**
	 * Elimina un turno.
	 * @param entity
	 */
	void delete(TurnoDTO dto);


    TurnoDTO update(TurnoDTO turno);
    
}
